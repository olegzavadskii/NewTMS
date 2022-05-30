/*2. Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.*/

package homework4.task5;

import java.util.Arrays;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        int min, max;
        double average;
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * arr.length);
        }
        System.out.println("Массив выглядит следующим образом " + Arrays.toString(arr));
        max = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;
        }
        System.out.println("Максимальное значение " + max);

        min = arr[0];
        for (int i : arr) {
            if (i < min)
                min = i;
        }
        System.out.println("Минимальное значение " + min);

        average = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = sum / arr.length;
            System.out.println("Среднее арифметическое значение массива " + average);
        }
    }
}
