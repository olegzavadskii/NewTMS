package homework15.lambda;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите 1 или 2");
        int numForLogic = scn.nextInt();

        //лямбда для текста в обратном порядке
        MyInterface theFirstInterface = (String textForReverse, int numberForLogic) -> {
            String reverseText = new StringBuilder(textForReverse).reverse().toString();
            System.out.println(reverseText);
        };

        //лямбда для нахождения факториала
        MyInterface theSecondInterface = (String textForReverse, int numberForLogic) -> {
            System.out.println("Факториал числа " + numberForLogic + " равен " + factorial(numberForLogic));
        };


        FunctionalClass functionalClass = new FunctionalClass();
        functionalClass.doSomething(numForLogic, "Hello world", 10,
                theFirstInterface, theSecondInterface);
    }

    //метод для поиска факториала
    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return factorial(number - 1) * number;
        }

    }
}
