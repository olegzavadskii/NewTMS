/*5. Создайте массив и заполните массив.
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке.*/

package homework4_Onedimensional_arrays.task4;

import java.util.Arrays;
import java.util.Scanner;

public class OddArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 3) * arr.length);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[0] = 0;
                arr[i] = 0;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
