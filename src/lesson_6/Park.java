package lesson_6;
/*
3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию
 об аттракционах, времени их работы и стоимости.
 */

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public void getPark() {
        System.out.println("name: " + name);
    }

    public class Attraction {
        private String nameAttraction;
        private String workingHours;
        private double price;

        public Attraction(String nameAttraction, String workingHours, double price) {
            this.nameAttraction = nameAttraction;
            this.workingHours = workingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction: " + nameAttraction + "\nworking hours: " + workingHours +  "\nprice: " + price;
        }
    }
}
