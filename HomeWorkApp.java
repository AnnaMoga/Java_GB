package lesson_1;

public class HomeWorkApp {
   public static void main (String[] args) {
       printThreeWord();
       checkSumSign();
       printColor();
       compareNumbers();
   }

    private static void compareNumbers() {
       int varD = 8;
       int varU = 2;
        System.out.println("Задание 4");
       if (varD >= varU) {
           System.out.println("a>=b");
       }
       else if (varD <= varU) {
           System.out.println("a<=b");
       }
        System.out.println("Задание выполнено!");
    }

    private static void printColor() {
       int value = 150;
        System.out.println("Задание 3");
       System.out.println(value);
       if (value <= 0) {
           System.out.println("Красный");
       }
       if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
       if (value > 100) {
           System.out.println("Зелёный");
       }
        System.out.println("Задание выполнено!");
    }

    private static void checkSumSign() {
       int varA = 5;
       int varB = 7;
        System.out.println("Задание 2");
       System.out.println(varA + varB);
            if (varA + varB >=0) {
            System.out.println("Сумма положительная");
        } else if (varA + varB <0) {
            System.out.println("Сумма отрицательная!");
            }
            System.out.println("Задание выполнено!");
    }
    private static void printThreeWord() {
       System.out.println("Задание 1");
       System.out.println("Orange");
       System.out.println("Banana");
       System.out.println("Apple");
       System.out.println("Задание выполнено!");
    }
}
