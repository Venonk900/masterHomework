package lesson4;

import java.util.Random;
import java.util.Scanner;

public class CrossesZeroes {


    //Предположение. Человек ходит Х. Программа - наоборот

    //Поле
    public static char[][] map;
    public static int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;

    //Константы-символы
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();


    /**
     * Создать игровое поле и заполнить его пустыми точками.
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        //нумерация столбцов
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < map.length; i++) {
            //вывод номера строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Считать 2 числа. Установить значение Х
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты кода в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    /**
     * Ход компуктера
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.printf("Искуственный интеллект ходит: : %d %d", x + 1, y + 1);
        System.out.println();
        map[x][y] = DOT_O;


    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    /**
     * Наивная реализация. (для размера 3)
     * @param dot X или O
     * @return победа или не до конца?
     */
    public static boolean checkWin(char dot) {
        //Проверка строк
        if (map[0][0] == dot && map[0][1] == dot && map[0][2] == dot) {
            return true;
        }
        if (map[1][0] == dot && map[1][1] == dot && map[1][2] == dot) {
            return true;
        }
        if (map[2][0] == dot && map[2][1] == dot && map[2][2] == dot) {
            return true;
        }
        //Проверка столбцов
        if (map[0][0] == dot && map[1][0] == dot && map[2][0] == dot) {
            return true;
        }
        if (map[0][1] == dot && map[1][1] == dot && map[2][1] == dot) {
            return true;
        }
        if (map[0][2] == dot && map[1][2] == dot && map[2][2] == dot) {
            return true;
        }
        //Проверка диагоналей
        if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot) {
            return true;
        }
        return false;
    }

    /**
     * Проверяет, что поле заполнено
     */
    public static boolean isFull() {
        for (int i=0; i< map.length; i++) {
            for (int j =0; j< map[i].length; j ++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void play() {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Выиграл человек");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Кожаный мешок, я победил!");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
         }
    }

    public static int getSize() {
        int number;
        while (true){
            System.out.println("Choose field 3 or 5");
            number = scanner.nextInt();
            if (number == 3) {
                System.out.println("field 3x3");
                return number;
            } else if (number == 5) {
                System.out.println("5x5");
                return number;
            }else {
                System.out.println("Again!");
            }
        }
    }

    public static void main(String[] args) {
        SIZE = getSize();
        System.out.println("Я хочу сыграть с тобой в игру!");
        play();
    }


}
