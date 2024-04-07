package lesson_7.task2;

public abstract class Figure implements Calculable {
    private String fillColor;
    private String borderColor;

    public Figure(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public abstract double getPerimeter();

    @Override
    public abstract double getArea();

    @Override
    public String toString() {
        return "Периметр = " + getPerimeter() +
                "\nплощадь = " + getArea() +
                "\nцвет заливки = " + fillColor +
                "\nцвет границ = " + borderColor;
    }
}
