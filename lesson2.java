package lesson_2;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println(doOne(5, 11));
        doTwo(5 );
        System.out.println(doThree(6));
        doFour("Ку-ку", 3);
        doFive(2016);
    }

    static boolean doOne(int a, int b) {
        System.out.println("Задание 1.");
        int sum = a + b;
        if (sum> 10 && sum <20) return true;
        else return false;
    }

    static void doTwo(int a) {
        System.out.println("Задание 2.");
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    static boolean doThree(int a) {
        System.out.println("Задание 3.");
        if (a < 0) return true;
        return false;
    }

    static void doFour(String str, int n) {
        System.out.println("Задание 4.");
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
    static void doFive(int year) {
        System.out.println("Задание 5.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }
}

