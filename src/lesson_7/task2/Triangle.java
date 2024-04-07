package lesson_7.task2;

public class Triangle extends Figure implements Calculable {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(String fillColor, String borderColor, double side1, double side2, double side3) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
