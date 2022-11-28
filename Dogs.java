package lesson_6_HW;

public class Dogs extends Animals{

    private final int distanceRun;
    private final int distanceSwim;
    public Dogs(String name, int Swim, int Run) {
        super(name, Swim, Run, "Пёсик");
        this.distanceRun = 500;
        this.distanceSwim = 10;
    }

    public void run() { // информация по испытанию объекта в беге
        if (this.getRun() <= distanceRun) {
            System.out.printf(this.getAnimal() + " " + this.getName() + " пробегает: " + Run + " м.%n");
        } else {
            System.out.println(this.getName() + " не может бежать так далеко");
        }
    }


    public void swim() {//информация по испытанию объекта в плавании
        if (this.getSwim() <= distanceSwim) {
            System.out.printf(this.getAnimal() + " " + this.getName() + " проплывает: " + Swim + " м.");
        } else {
            System.out.println(this.getName() + " не может плыть так далеко");
        }
    }

    public void animalInfo() { // info о характеристиках объекта при создании
        System.out.println(this.getAnimal() + " " + this.getName() + " может пробежать: " + this.distanceRun + " м., может проплыть: "
                + this.distanceSwim + " м.");
    }
}
