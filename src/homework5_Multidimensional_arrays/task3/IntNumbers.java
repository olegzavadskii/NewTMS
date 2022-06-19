/*Сортировка элементов по строкам*/

package homework5_Multidimensional_arrays.task3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class IntNumbers {
    public static void main(String[] args) {
        //объявление массива
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        System.out.println(); //просто пустая строка для разделения в консоли)
        int[][] arr = new int[size][size];

        //заполнение массива
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = gen.nextInt(50) + 1;
            }
        }
        System.out.println("Массив выглядит следующим образом: " + Arrays.deepToString(arr));

        //сортировка
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println("Отсортированные элементы по строкам: " + Arrays.deepToString(arr));
    }
}
