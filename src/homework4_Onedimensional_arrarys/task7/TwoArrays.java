/*3. Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны)*/

package homework4_Onedimensional_arrarys.task7;

import java.util.Arrays;

public class TwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {34, 13, 45, 68, 401};
        int[] arr2 = {15, 170, 442, 47, 14};
        System.out.println("Первый массив " + Arrays.toString(arr1));
        System.out.println("Второй массив " + Arrays.toString(arr2));

        //поиск среднего арифметического для первого массива
        double average1 = 0;
        if (arr1.length > 0) {
            double sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i];
            }
            average1 = sum / arr1.length;
            System.out.println("Среднее арифметическое первого массива равно " + average1);
        }

        //поиск среднего арифметического для второго массива
        double average2 = 0;
        if (arr2.length > 0) {
            double sum = 0;
            for (int i = 0; i < arr2.length; i++) {
                sum += arr2[i];
            }
            average2 = sum / arr2.length;
            System.out.println("Среднее арифметическое второго массива равно " + average2);
        }

        //сравнение значений средних арифметических
        if (average1 != average2) {
            if (average1 > average2) {
                System.out.println("Среднее арифметическое первого массива больше среднего арифметического второго массива");
            } else {
                System.out.println("Среднее арифметическое второго массива больше среднего арифметического первого массива");
            }
        }
        if (average1 == average2) {
            System.out.println("Значения средних арифметических равны");
        }
    }
}