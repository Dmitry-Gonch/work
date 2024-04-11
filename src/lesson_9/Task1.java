package lesson_9;

import java.util.*;

/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список
уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается
каждое слово. (реализовать с использованием коллекций)
 */
public class Task1 {
    public static void main(String[] args) {
        String[] arrayWords = {
                "Альфа",
                "Бета",
                "Бета",
                "Гамма",
                "Эта",
                "Дельта",
                "Лямбда",
                "Тета",
                "Эпсилон",
                "Гамма",
                "Бета",
                "Лямбда",
                "Альфа",
                "Эпсилон"
        };

        System.out.println("Массив c набором слов: \n" + Arrays.toString(arrayWords));

        Set<String> distinct = new HashSet<>(List.of(arrayWords));
        System.out.println("Список уникальных слов: \n" + distinct);

        Map<String, Integer> countWords = new HashMap<>();

        for (String word : arrayWords) {
            if (countWords.containsKey(word)) {
                int count = countWords.get(word);
                countWords.put(word, count + 1);
            } else {
                countWords.put(word, 1);
            }
        }

        System.out.println("Количество слов: \n" + countWords);
    }
}
