package lesson_6;

import java.util.Arrays;

public class Lesson6 {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivanov Ivan Ivanovich", "director", "ivan56@gmail.com", "297652321", 5000.0, 45);
        Employee petr = new Employee("Petrov Petr Petrovich", "manager", "petr20@gmail.com", "295662384", 3000.0, 32);

        ivan.info();
        petr.info();

        Person[] persArray = new Person[5];
        persArray[0] = new Person("Semenov Semyon", "General Manager", "semen@gmail.com", "298223326", 4500.0, 35);
        persArray[1] = new Person("Sidorova Anna", "Sales Manager", "sidor@gmail.com", "295269978", 4200.0, 28);
        persArray[2] = new Person("Kruglov Sergey", "IT Manager", "kruglov@gmail.com", "296288512", 4800.0, 36);
        persArray[3] = new Person("Ivanov Ivan", "Engineer", "ivivan@gmail.com", "295998574", 4000.0, 30);
        persArray[4] = new Person("Petrov Petr", "Developer", "petr@gmail.com", "295561235", 5000.0, 39);

        System.out.println(Arrays.toString(persArray));

        Park disneyland = new Park("Disneyland");
        Park.Attraction[] attractions = new Park.Attraction[3];
        attractions[0] = disneyland.new Attraction("Adventureland", "10:00 - 19:00", 50);
        attractions[1] = disneyland.new Attraction("Fantasyland", "10:00 - 19:00", 52);
        attractions[2] = disneyland.new Attraction("Land of discovery", "10:00 - 19:00", 55);

        disneyland.getPark();
        System.out.println(Arrays.toString(attractions));
    }
}
