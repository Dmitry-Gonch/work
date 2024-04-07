package lesson_7.task2;

public class Rectangle extends Figure {
    private final double side1;
    private final double side2;

    public Rectangle(String fillColor, String borderColor, double side1, double side2) {
        super(fillColor, borderColor);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}
