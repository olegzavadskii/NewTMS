/*Удалить число из массива и вывести новый массив*/

package homework4.task3;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteNumber {
    public static void main(String[] args) {
        int i;
        int[] arr2;
        int toDelete;
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        for (i = 0; i < arr1.length; i++) {
            arr1[i] = (int) ((Math.random() * 3) * arr1.length);
        }

        System.out.println("Первоначальный массив " + Arrays.toString(arr1));
        System.out.println("Введите число, которое необходимо удалить");
        toDelete = scanner.nextInt();
        one:
        {
            for (i = 0; i < arr1.length; i++) {
                if (arr1[i] == toDelete) {
                    arr2 = new int[arr1.length - 1];
                    for (int j = 0; j < i; j++) {
                        arr2[j] = arr1[j];
                    }
                    for (int k = i; k < arr1.length - 1; k++) {
                        arr2[k] = arr1[k + 1];
                    }
                    System.out.println("Новый массив " + Arrays.toString(arr2));
                    break one;
                }
            }
            System.out.println("Данное число отсутствует в массиве");
        }
    }
}
