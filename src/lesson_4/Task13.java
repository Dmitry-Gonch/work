package lesson_4;

/*
Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из
диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему
принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
 */

public class Task13 {
    public static void main(String[] args) {
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
}
