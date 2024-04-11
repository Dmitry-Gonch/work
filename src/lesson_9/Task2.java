package lesson_9;

public class Task2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.addContact("Semenov", "298223326");
        phonebook.addContact("Ivanov", "297652321");
        phonebook.addContact("Petrov", "295662384");
        phonebook.addContact("Kruglov", "296288512");
        phonebook.addContact("Kruglov", "296288513");
        phonebook.addContact("Semenov", "298222226");

        System.out.println("Phone numbers for Semenov: " + phonebook.getPhoneNumber("Semenov"));
        System.out.println("Phone numbers for Ivanov: " + phonebook.getPhoneNumber("Ivanov"));
        System.out.println("Phone numbers for Petrov: " + phonebook.getPhoneNumber("Petrov"));
        System.out.println("Phone numbers for Kruglov: " + phonebook.getPhoneNumber("Kruglov"));
    }
}
