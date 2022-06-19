/*Поиск суммы всех элементов массива*/

package homework5_Multidimensional_arrays.task5;

import java.util.Random;
import java.util.Scanner;

public class Sum {


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
                arr[i][j] = gen.nextInt(10) + 1;

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //поиск суммы
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов массива составляет " + sum);
    }
}
