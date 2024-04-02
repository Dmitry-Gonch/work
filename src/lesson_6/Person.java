package lesson_6;
/*
2. Создать массив из 5 сотрудников. Пример:
вначале объявляем массив объектов Person[] persArray = new Person[5]; потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...persArray[4] = new Person(...);
 */
public class Person {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Person(String fullName, String jobTitle, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "fullName: " + fullName + "\njobTitle: " + jobTitle + "\nemail: " + email +
                "\nphoneNumber: " + phoneNumber + "\nsalary: " + salary + "\nage: " + age;
    }
}
