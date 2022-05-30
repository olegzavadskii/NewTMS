package homework9.task1;

import static homework9.task1.VectorThree.createArrayThree;
import static homework9.task1.VectorTwo.createArrayTwo;

public class MainApp {
    public static void main(String[] args) {
        VectorTwo vectorTwo1 = new VectorTwo(14, 16);
        VectorTwo vectorTwo2 = new VectorTwo(21, 26);

        VectorThree vectorThree1 = new VectorThree(24, 31, 45);
        VectorThree vectorThree2 = new VectorThree(34, 37, 48);

        //вычисление скалярного произведения векторов
        vectorTwo1.scalarTwo(vectorTwo2);
        vectorThree1.scalarThree(vectorThree2);
        System.out.println();

        //вычисление длины вектора
        vectorTwo1.length();
        vectorThree1.length();
        System.out.println();

        //сумма векторов
        vectorTwo1.plusVectorTwo(vectorTwo2);
        vectorThree1.plusVectorThree(vectorThree2);
        System.out.println();

        //разность векторов
        vectorTwo1.minusVectorTwo(vectorTwo2);
        vectorThree1.minusVectorThree(vectorThree2);
        System.out.println();

        //вывод информации о векторах
        System.out.println(vectorTwo2.toString());
        System.out.println(vectorThree2.toString());
        System.out.println();

        //сравнение векторов
        vectorTwo1.compare(vectorTwo2);
        vectorThree1.compare(vectorThree2);
        System.out.println();

        //создание массива векторов
        createArrayTwo(3);
        createArrayThree(3);

    }

}
