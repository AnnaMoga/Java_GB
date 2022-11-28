package lesson_6_HW;

public class Cats extends Animals {

    private final int distanceRun;
    private final int distanceSwim;
    public Cats(String name, int swim, int run) {
        super(name, swim, run, "Котик");
        this.distanceRun = 200;
        this.distanceSwim = 0;
    }

    public void run() { // информация по испытанию объекта в беге
        if (this.getRun() <= distanceRun) {
            System.out.printf(this.getAnimal() + " " + this.getName() + " пробегает: " + Run + " м.%n");
        } else {
            System.out.println(this.getName() + " не может бежать так далеко");
        }
    }


    public void swim() {//информация по испытанию объекта в плавании
        System.out.println("Котики не любят плавать!");
    }

    public void animalInfo() { // info о характеристиках объекта при создании
        System.out.println(this.getAnimal() + " " + this.getName() + " может пробежать: " + this.distanceRun + " м., может проплыть: "
                + this.distanceSwim + " м.");
    }



/*   public void distanceSwim() {
        System.out.println("Котики не любят плавать!");
    }*/
}
