package lesson_6_HW;

import java.util.Random;

public class Animals {

    private String name;
    protected int Swim;
    protected int Run;


    private final String animal;


    public Animals(String name, int swim, int run, String animal) {
        this.name = name;
        this.Swim = swim;
        this.Run = run;
        this.animal = animal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSwim() {
        return Swim;
    }

    public void setSwim(int swim) {
        this.Swim = swim;
    }

    public int getRun() {
        return Run;
    }

    public void setRun(int run) {
        this.Run = run;
    }

    public String getAnimal() {
        return animal;
    }
/*
    public void run() { // информация по испытанию объекта в беге
        if (this.getRun() >= Run) {
            System.out.printf(this.getAnimal() + " " + this.getName() + " пробегает: " + Run + " м.");
        } else {
            System.out.println(this.getName() + " не может бежать так далеко");
        }
    }


    public void swim() {//информация по испытанию объекта в плавании
        if (this.getSwim() >= Swim) {
            System.out.printf(this.getAnimal() + " " + this.getName() + " проплывает: " + Swim + " м.");
        } else {
            System.out.println(this.getName() + " не может плыть так далеко");
        }
    }

    public void animalInfo() { // info о характеристиках объекта при создании
        System.out.println(this.animal + " " + this.name + " может пробежать: " + this.Run + " м., может проплыть: "
                + this.Swim + " м.");
    }*/
}
