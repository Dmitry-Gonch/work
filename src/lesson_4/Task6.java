package lesson_4;
/*
Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */

public class Task6 {
    public static void numberIsPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Negative number");
        }
    }

    public static void main(String[] args) {

        numberIsPositiveOrNegative(2);
    }
}
