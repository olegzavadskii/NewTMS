package homework15_Date_and_Lamdba.lambda;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите 1 или 2");
        int numForLogic = scn.nextInt();

        //лямбда для текста в обратном порядке
        InterfaceForReverse interfaceForReverse = (String textForReverse) -> {
            String reverseText = new StringBuilder(textForReverse).reverse().toString();
            System.out.println(reverseText);
        };

        //лямбда для нахождения факториала
        InterfaceForFactorial interfaceForFactorial = (int numberForFactorial) -> {
            FactorialFinder ff = new FactorialFinder();
            System.out.println("Факториал числа " + numberForFactorial + " равен " + ff.findFactorial(numberForFactorial));
        };


        FunctionalClass functionalClass = new FunctionalClass();
        functionalClass.reverseOrFindFactorial(numForLogic, "Hello world", 10,
                interfaceForReverse, interfaceForFactorial);
    }

}
