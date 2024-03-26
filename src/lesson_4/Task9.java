package lesson_4;

/*
Напишите метод, который определяет, является ли год високосным, и возвращает boolean
(високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме
каждого 100-го, при этом каждый 400-й – високосный.
 */

public class Task9 {
    public static boolean isLeapYear1(int year) {
        //return  year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
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

    public static void main(String[] args) {

        System.out.println(isLeapYear1(2023));
        System.out.println(isLeapYear1(2024));

        System.out.println(isLeapYear2(2023));
        System.out.println(isLeapYear2(2024));
    }
}
