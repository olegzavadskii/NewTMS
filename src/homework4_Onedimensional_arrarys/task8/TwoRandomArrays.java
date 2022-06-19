/*4. Создайте массив из n случайных целых чисел и выведите его на экран.
Размер массива пусть задается с консоли и размер массива может быть
больше 5 и меньше или равно 10.
Если n не удовлетворяет условию - выведите сообщение об этом.
Если пользователь ввёл не подходящее число, то программа должна
просить пользователя повторить ввод.
Создайте второй массив только из чётных элементов первого массива,
если они там есть, и вывести его на экран.*/

package homework4_Onedimensional_arrarys.task8;

import java.util.Arrays;
import java.util.Scanner;

public class TwoRandomArrays {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int i = 0;
        if (size > 5 & size <= 10) {
            for (i = 0; i < size; i++) {
                arr[i] = (int) (Math.random() * size);
            }
            System.out.println("Массив выглядит следующим образом " + Arrays.toString(arr));
        } else {
            System.out.println("Введите число от 6 до 10");
        }
        int[] arr2 = new int[size];
        for (i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                arr2[i] = arr[i];
            }
        }
        if (size > 5 & size <= 10) {
            System.out.println("Новый массив выглядит следующим образом " + Arrays.toString(arr2));
        }
    }
}
