package homework9_OOP.task2;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        //создание массива с координатами для векторов
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ((int) (Math.random() * 50) + 1);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println();

        //создание экземпляров класса Vector
        Vector vector1 = new Vector(arr[0][1], arr[1][2]);
        Vector vector2 = new Vector(arr[2][1], arr[2][2]);


        //вывод информации о векторах
        System.out.println(vector1.toString());
        System.out.println(vector2.toString());
        System.out.println();

        //высление длины векторов
        vector1.length();
        vector2.length();
        System.out.println();

        //сравнение векторов
        vector1.compare(vector2);
        System.out.println();

        //вычисление скалярного произведения
        vector1.scalar(vector2);
        System.out.println();

        //сложение векторов
        vector1.plusVector(vector2);
        System.out.println();

        //разность векторов
        vector1.minusVector(vector2);

    }

}
