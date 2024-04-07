package lesson_7.task2;

import java.util.Arrays;

/*
Задание 2:
Применяя интерфейсы написать программу расчета периметра и площади геометрических фигур: круг, прямоугольник, треугольник.
Задать для каждой фигуры цвет заливки и цвет границы.
Результат полученных характеристик [ Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в консоль.

Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в качестве дефолтных методов в интерфейсе.
 */
public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle("Green", "Black", 5.0);
        System.out.println("Характеристики круга: \n" + circle);

        Triangle triangle = new Triangle("Blue", "Red", 3.0, 4.0, 5.0);
        System.out.println("Характеристики треугольника: \n" + triangle);

        Rectangle rectangle = new Rectangle("Orange","Purple", 4.0, 5.0);
        System.out.println("Характеристики прямоугольника: \n" + rectangle);
    }
}
