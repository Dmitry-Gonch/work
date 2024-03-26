package lesson_4;

/*
Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
 */

import java.util.Arrays;

public class Task14 {
    public static int[] returnArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }

        return array;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(returnArray(5,4)));
    }
}
