package lesson_4;
/*
Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте
их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если
их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае
- “Сумма отрицательная”;
 */

public class Task2 {
    public static void checkSumSign() {
        int a = 8;
        int b = -9;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        checkSumSign();
    }
}
