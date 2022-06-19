/*Сумма чисел от 1 до введенного*/

package homework3_If_if_else_for_while_do_while_switch.task16;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число...");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = (n * (n + 1)) / 2;
        System.out.println("Сумма чисел от 1 до введенного равна " + x);
    }
}
