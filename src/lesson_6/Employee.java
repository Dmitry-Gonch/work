package lesson_6;
/*
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 */

public class Employee {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String jobTitle, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("fullName: " + fullName + "\njobTitle: " + jobTitle + "\nemail: " + email +
                "\nphoneNumber: " + phoneNumber + "\nsalary: " + salary + "\nage: " + age);
    }
}
