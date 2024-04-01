package lesson_4;

import java.util.Arrays;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("=====Task 1=====");
        printThreeWords();
        printThreeWords2();

        System.out.println("=====Task 2=====");
        checkSumSign();

        System.out.println("=====Task 3=====");
        printColor();

        System.out.println("=====Task 4=====");
        compareNumbers();

        System.out.println("=====Task 5=====\n" + checkSumInRange(1, 8));

        System.out.println("=====Task 6=====");
        numberIsPositiveOrNegative(2);

        System.out.println("=====Task 7=====\n" + isNumberPositiveOrNegative(-1));

        System.out.println("=====Task 8=====");
        printLineNumberOfTimes("Hello world", 5);

        System.out.println("=====Task 9=====");
        System.out.println(isLeapYear1(2023));
        System.out.println(isLeapYear1(2024));
        System.out.println(isLeapYear2(2023));
        System.out.println(isLeapYear2(2024));

        System.out.println("=====Task 10=====\n" + Arrays.toString(invertArray()));

        System.out.println("=====Task 11=====\n" + Arrays.toString(fillArray()));

        System.out.println("=====Task 12=====\n" + Arrays.toString(changeArray()));

        System.out.println("=====Task 13=====");
        createArray();

        System.out.println("=====Task 14=====\n" + Arrays.toString(returnArray(5, 4)));
    }

/*
1. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
Orange, Banana, Apple.
 */

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void printThreeWords2() {
        System.out.println("Orange\nBanana\nApple");
    }

/*
2. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте
их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если
их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае
- “Сумма отрицательная”;
 */

    public static void checkSumSign() {
        int a = 8;
        int b = -9;
        System.out.println((a + b) >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

/*
3. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте
ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести
сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
 */

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

/*
4. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 */

    public static void compareNumbers() {
        int a = 35;
        int b = 52;
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

/*
5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */

    public static boolean checkSumInRange(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

/*
6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
 */

    public static void numberIsPositiveOrNegative(int number) {
        System.out.println(number >= 0 ? "Number is positive" : "Negative number");
    }

/*
7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
если число отрицательное, и вернуть false если положительное.
 */

    public static boolean isNumberPositiveOrNegative(int number) {
        return number < 0;
    }

/*
8. Напишите метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
в консоль указанную строку, указанное количество раз;
 */

    public static void printLineNumberOfTimes(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

/*
9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме
каждого 100-го, при этом каждый 400-й – високосный.
 */

    public static boolean isLeapYear1(int year) {
        if (year % 4 == 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear2(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

/*
10. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
С помощью цикла и условия заменить 0 на 1, 1 на 0;
 */

    public static int[] invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }

        return array;
    }

/*
11. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
значениями 1 2 3 4 5 6 7 8 ... 100;
 */

    public static int[] fillArray() {
        int[] array = new int[100];

        for (int i = 0; i <= array.length - 1; i++) {
            array[i] = i + 1;
        }

        return array;
    }

/*
12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2;
 */

    public static int[] changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        return array;
    }

/*
13. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
 */

    public static void createArray() {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array.length - i - 1] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }

            System.out.println();
        }
    }

/*
Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
 */

    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}
