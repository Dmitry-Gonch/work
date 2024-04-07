package lesson_8;
/*
1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого
размера необходимо бросить исключение MyArraySizeException.
2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то
элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть
брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
MyArrayDataException и вывести результат расчета.
 */
public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"7", "5", "3", "8"},
                {"2", "4", "10", "11"},
                {"21", "6", "9", "2"},
                {"5", "10", "11", "8"}
        };

        String[][] arr2 = new String[][]{
                {"7", "5", "3", "8"},
                {"2", "4", "10", "11"},
                {"21", "6", "9", "2"}
        };

        String[][] arr3 = new String[][]{
                {"7", "5", "3"},
                {"2", "4", "10", "11"},
                {"21", "6", "9", "2"},
                {"5", "10", "11", "8"}
        };

        String[][] arr4 = new String[][]{
                {"7", "f", "3", "8"},
                {"2", "4", "10", "11"},
                {"21", "6", "9", "2"},
                {"5", "10", "11", "8"}
        };

        try {
            getSumArrayElements(arr1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        try {
            getSumArrayElements(arr2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        try {
            getSumArrayElements(arr3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
        try {
            getSumArrayElements(arr4);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }
    }

    public static void getSumArrayElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Неверный размер массива");
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Неверный размер массива");
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке: [" + i + "]" + "[" + j + "]" + " лежат неверные данные");
                }
            }
        }

        System.out.println("Сумма элементов массива: " + sum);
    }
}


