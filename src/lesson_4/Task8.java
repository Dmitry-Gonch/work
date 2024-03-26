package lesson_4;
/*
Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
в консоль указанную строку, указанное количество раз;
 */

public class Task8 {
    public static void printLineNumberOfTimes(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    public static void main(String[] args) {
        printLineNumberOfTimes("Hello world!!!", 5);
    }
}
