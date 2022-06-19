/*Создание трехмерного массива и увеличение его элементов*/

package homework5_Multidimensional_arrarys.task6;

import java.util.Random;
import java.util.Scanner;

public class TripleArray {


    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println(); //просто пустая строка для разделения в консоли)
        int[][][] arr;
        arr = new int[size][size][size];
        fillArr(arr);
        printArr(arr);
        rise(arr);
    }


    public static int[][][] fillArr(int[][][] arr) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int q = 0; q < arr.length; q++) {
                    arr[i][j][q] = gen.nextInt(10) + 1;
                }
            }
        }
        return arr;
    }

    public static void printArr(int[][][] arr) {
        System.out.println("Начальная версия массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int q = 0; q < arr.length; q++) {
                    System.out.print(arr[i][j][q] + " ");
                }
            }
            System.out.println();
        }
        System.out.println(); //просто пустая строка для разделения в консоли)
    }


    public static void rise(int[][][] arr) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для увеличения каждого члена массива");
        int r = scan.nextInt();
        System.out.println();
        System.out.println("Конечная версия массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int q = 0; q < arr.length; q++) {
                    arr[i][j][q] = arr[i][j][q] + r;
                    System.out.print(arr[i][j][q] + " ");
                }
            }
            System.out.println();
        }
    }


}