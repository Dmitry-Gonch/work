package lesson_7.task1;

public class Dog extends Animal {
    private static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    public void run(int runDistance) {
        System.out.println(runDistance > 0 && runDistance <= 500
                ? getName() + " пробежал " + runDistance + " м."
                : getName() + " не может пробежать " + runDistance + " м.");

    }

    public void swim(int swimDistance) {
        System.out.println(swimDistance > 0 && swimDistance <= 10
                ? getName() + " проплыл " + swimDistance + " м."
                : getName() + " не может проплыть " + swimDistance + " м.");
    }

    public static int getCount() {
        return count;
    }
}
