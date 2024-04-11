package lesson_9;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
(в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class Phonebook {
    private final Map<String, Set<String>> phonebook = new TreeMap<>();

    public void addContact(String lastName, String phoneNumber) {
        if (phonebook.containsKey(lastName)) {
            Set<String> phoneNumbers = phonebook.get(lastName);
            phoneNumbers.add(phoneNumber);
        } else {
            Set<String> phoneNumbers = new TreeSet<>();
            phoneNumbers.add(phoneNumber);
            phonebook.put(lastName, phoneNumbers);
        }
    }

    public Set<String> getPhoneNumber(String lastName) {
        return phonebook.get(lastName);
    }
}
