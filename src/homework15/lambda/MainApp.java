package homework15.lambda;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите 1 или 2");
        int numForLogic = scn.nextInt();

        FunctionalClass funCl1 = new FunctionalClass();
        funCl1.doSmth("Hello world", 10, (String text, int number) -> {
            if (numForLogic == 1) {
                String reverseText = new StringBuilder(text).reverse().toString();
                System.out.println(reverseText);
            } else if (numForLogic == 2) {
                System.out.println("Факториал числа " + number + " равен " + factorial(number));
            }
        });


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
