/*Вывод на консоль диагоналей массива*/

package homework5.task2;

import java.util.Scanner;
import java.util.Random;

public class Diagonals {
    public static void main(String[] args) {
        //объявление массива
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println(); //просто пустая строка для разделения в консоли)
        int[][] arr = new int[size][size];

        //заполнение массива
        Random gen = new Random();
        System.out.println("Массив выглядит следующим образом:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = gen.nextInt(50) + 1;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int max = arr.length - 1;

        //вывод главной диагонали
        System.out.print("Главная диагональ: ");
        for (int i = 0; i <= max; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();

        //вывод побочной диагонали
        System.out.print("Побочная диагональ: ");
        for (int i = 0; i <= max; i++) {
            System.out.print(arr[i][max - i] + " ");
        }
        System.out.println();


    }
}
