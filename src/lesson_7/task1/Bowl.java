package lesson_7.task1;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Еда не добавлена в миску");
        } else {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды в миску");
        }
    }

    public void decreaseFood(int appetite) {
        if (foodAmount <= 0) {
            System.out.println("Невозможно уменьшить отрицательное количество еды.");
        } else if (foodAmount < appetite) {
            System.out.println("В миске недостаточно еды.");
        } else {
            foodAmount -= appetite;
        }
    }
}
