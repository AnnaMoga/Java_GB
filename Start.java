package lesson_6_HW;

public class Start {
    public static void main(String[] args) {

        Cats cat1 = new Cats("Пушок", 120, 50);
        Cats cat2 = new Cats("Пушинка", 0, 190);

        Dogs dog1 = new Dogs("Тучка", 11, 450);
        Dogs dog2 = new Dogs("Облачко", 10, 600);

        System.out.println("Информация о котиках:");
        cat1.animalInfo();
        cat2.animalInfo();
        System.out.println();

        System.out.println("Информация о пёсиках:");
        dog1.animalInfo();
        dog2.animalInfo();
        System.out.println();

        System.out.println("Испытание первого пёсика:");
        dog1.run();
        dog1.swim();
        System.out.println();
        System.out.println();

        System.out.println("Испытание второго пёсика:");
        dog2.run();
        dog2.swim();
        System.out.println();
        System.out.println();

        System.out.println("Испытание первого пушистого засранца:");
        cat1.run();
        cat1.swim();
        System.out.println();
        System.out.println();

        System.out.println("Испытание второго пушистого засранца:");
        cat2.run();
        cat2.swim();
        System.out.println();
        System.out.println();
    }
}
