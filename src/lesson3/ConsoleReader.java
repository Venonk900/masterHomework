package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConsoleReader {

    static Scanner scanner = new Scanner(System.in);

    static Random random = new Random();

    public static void main(String[] args) {


        System.out.println("Введите размер массива");
        int size = readUntil();
        int array[] = new int[size];
        for (int i =0; i< array.length; i++) {
            System.out.printf("Введите чему равен %d элемент", (i+1));
            array[i] = scanner.nextInt();
        }
        int index = random.nextInt(array.length);
        System.out.println(array[index]);

        System.out.printf("Ваш массив %s", Arrays.toString(array));
        System.out.printf("Минимум вашего массива %d", ArrayTasks.findMin(array));

        System.out.printf("Тут мы выведем строку: %s\n, а тут выведем число %d", "string", 10);



    }

    public static boolean isLeap(int year) {
        System.out.println("smt");

        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int readUntil(){
        int n=0;
        do {

            System.out.println("ВВедите число от 0 до 10");
            n = scanner.nextInt();
        } while (!(n >=0 && n<= 10));
        return n;
    }


}
