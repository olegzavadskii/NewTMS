/*Сортировка пузырьком*/

package homework4.task2;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) ((Math.random() * 3) * numbers.length);
        }
        System.out.println(Arrays.toString(numbers));

        int a, b, t;
        for (a = 1; a < numbers.length; a++) {
            for (b = numbers.length - 1; b >= a; b--) {
                if (numbers[b - 1] > numbers[b]) {
                    t = numbers[b - 1];
                    numbers[b - 1] = numbers[b];
                    numbers[b] = t;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
