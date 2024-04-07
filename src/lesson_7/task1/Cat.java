package lesson_7.task1;

public class Cat extends Animal {
    private static int count;
    private boolean satiety;
    private final int appetite;

    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        satiety = false;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void run(int runDistance) {
        System.out.println(runDistance > 0 && runDistance <= 200
                ? getName() + " пробежал " + runDistance + " м."
                : getName() + " не может пробежать " + runDistance + " м.");
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Кот не умеет плавать");
    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() >= appetite) {
            bowl.decreaseFood(appetite);
            satiety = true;
            System.out.println(getName() + " покушал из миски " + appetite + " еды.");
        } else {
            System.out.println("Добавьте еды " + getName());
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
