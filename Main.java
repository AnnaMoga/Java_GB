package lesson_7_HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cats[] allCats = new Cats[]{
        new Cats("Пушинка", 20),
        new Cats("Лапочка", 15)};
        Dish dishes = new Dish(50);
        dishes.info();
        System.out.println("Котики проголодались.");

        int i;
        for (i = 1; i < allCats.length; ++i) {
            if (!allCats[i].isHungry && allCats[i].getAppetite() > dishes.getFood()) {
                allCats[i].eat(dishes);
                allCats[i].isHungry = true;
                System.out.println(allCats[i].getName() + " она вкусно поела :)");
            } else {
                System.out.println(allCats[i].getName() + " очень голодна :(");
            }
        }

        dishes.info();
        System.out.println("Сколько грамм корма Вы хотите добавить?");
        i = scanner.nextInt();
        dishes.addFood(i);
        dishes.info();
    }
}

