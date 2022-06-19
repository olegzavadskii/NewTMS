/*Поиск числа в массиве*/

package homework4_Onedimensional_arrarys.task6;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {
    public static void main(String[] args) {
        int i, size, num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        size = scanner.nextInt(); //задаем размер массива
        int[] array = new int[size];
        for (i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 3) * array.length);
        }
        System.out.println(Arrays.toString(array));

        System.out.println("Введите число для поиска");
        num = scanner.nextInt();
        for (i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.println("Число входит в массив. Оно находится под индексом " + i);
                break;
            }
        }
        if (i == array.length) {
            System.out.println("Число не входит в массив");
        }
    }
}
