package lesson_4;
/*
Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
если число отрицательное, и вернуть false если положительное.
 */

public class Task7 {
    public static boolean isNumberPositiveOrNegative(int number) {
        return number < 0;
    }

    public static void main(String[] args) {
        System.out.println(isNumberPositiveOrNegative(-1));
    }
}
