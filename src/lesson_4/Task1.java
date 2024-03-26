package lesson_4;
/*
Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
Orange, Banana, Apple.
 */

public class Task1 {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void printThreeWords2() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void main(String[] args) {
        printThreeWords();
        printThreeWords2();
    }
}
