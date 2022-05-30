package factorial;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число для нахождения факториала");
        int x = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        System.out.println("Факториал числа " + x + " равен " + result);
    }
}
