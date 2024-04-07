package lesson_7.task1;

public class Main {
    public static void main(String[] args) {

        Cat catVaska = new Cat("Vaska", 10);
        catVaska.run(100);
        catVaska.swim(2);

        Cat catBarsik = new Cat("Barsik", 11);
        catBarsik.run(205);
        catBarsik.swim(-1);

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(10);
        dogBobik.swim(9);

        Dog dogBim = new Dog("Bim");
        dogBim.run(501);
        dogBim.swim(11);

        System.out.println("Количество котов: " + Cat.getCount());
        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Количество животных: " + Animal.getCount());

        Bowl bowl = new Bowl(20);
        catVaska.eat(bowl);
        System.out.println("Сытость " + catVaska.getName() + ": " + catVaska.isSatiety());
        catBarsik.eat(bowl);
        System.out.println("Сытость " + catBarsik.getName() + ": " + catBarsik.isSatiety());
        bowl.addFood(11);
        catBarsik.eat(bowl);
        System.out.println("Сытость " + catBarsik.getName() + ": " + catBarsik.isSatiety());

        Cat[] cats = {catVaska, catBarsik};
        Bowl bowl1 = new Bowl(20);

        for (Cat cat : cats) {
            cat.eat(bowl1);
        }

        bowl1.addFood(20);

        for (Cat cat : cats) {
            cat.eat(bowl1);
        }

        for (Cat cat : cats) {
            System.out.println("Сытость " + cat.getName() + ": " + cat.isSatiety());
        }
    }
}
