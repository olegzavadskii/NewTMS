/*Квадраты чисел от 10 до 20 включительно*/

package homework3_If_if_else_for_while_do_while_switch.task13;

public class SquareOfNumbers {
    public static void main(String[] args) {
        int x = 10;
        int b = x * x;
        for (; x <= 20; x++, b = x * x) {
            System.out.println("Квадрат числа " + x + " равен " + b);
        }
    }
}
