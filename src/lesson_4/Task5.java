package lesson_4;

/*
Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
 */
public class Task5 {
    public static boolean checkSumInRange(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void main(String[] args) {

        System.out.println(checkSumInRange(1, 8));
    }
}
