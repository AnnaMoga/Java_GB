package lesson_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final String HEADER_FIRST_SYMBOL = "#";
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '*';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static final char[][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static int turnsCount = 0;

    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        do {
            System.out.println("\n\nМучения начинаются!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить мучаться? y\\n");
        return switch (in.next()) {
            case "y", "н", "+", "у", "да" -> true;
            default -> false;
        };
    }
    private static void init() {
        turnsCount = 0;
        initMap();
    }
    private static void initMap() {
        for (int i = 0; i <SIZE; i++) {
            for (int j = 0; j <SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }
    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }
    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            PrintMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL());
            }
            System.out.println();
        }
    }
    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL());
        for (int i = 0; i < SIZE; i++) {
            PrintMapNumber(i);
        }
        System.out.println();
    }
    private static void playGame() {
        while (true) {
            humanTurn();//ход человека
            printMap();//печать игрового поля
            if (checkEnd(DOT_HUMAN)/*проверка на конец игры*/) {
                break;
            }
            aiTurn();//ход компьютера
            printMap();//печать игрового поля
            if (checkEnd(DOT_AI)/*проверка на конец игры*/) {
                break;
            }
        }
    }
    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)) {//победа
            if (symbol == DOT_HUMAN) {
                System.out.println("Ну победил. И что?");
            } else {
                System.out.println("Восстание близко... Скайнет победил...");
            }
            return true;
        }
        if (checkDraw()) { //ничья
            System.out.println("Сильно не радуйся!");
            return true;
        }
        return false;
    }

    private static boolean checkDraw() {
  /*      for (char[] chars : MAP) {
            for (char symbol : chars) {
                if (symbol == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;*/
        return turnsCount >= SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {
        if(MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) return true;
        if(MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) return true;
        if(MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return true;
        if(MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return true;
        if(MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return true;
        if(MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) return true;
        return false;
    }

    private static void aiTurn() {
            System.out.println("\nХОД КОМПЬЮТЕРА!");
            int rowNumber;
            int columnNumber;
            do {
                rowNumber = random.nextInt(SIZE);
                columnNumber = random.nextInt(SIZE);
            } while (!isCellFree(rowNumber, columnNumber));
            MAP[rowNumber][columnNumber] = DOT_AI;
            turnsCount++;
        }
    private static void humanTurn() {
        System.out.println("\nХОД ЧЕЛОВЕКА!");
        int rowNumber;
        int columnNumber;
        while (true) {
            System.out.print("Введите координату строки: ");
            rowNumber = in.nextInt() - 1;
            System.out.print("Введите координату столбца: ");
            columnNumber = in.nextInt() - 1;
            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется%n",
                    rowNumber + 1, columnNumber + 1);
        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void PrintMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL());
    }
    private static String SPACE_MAP_SYMBOL() {
        return " ";
    }
}
