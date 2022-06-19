/*Первые 11 членов последовательности Фибоначчи*/

package homework3_If_if_else_for_while_do_while_switch.task4;

public class Fibonacci {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 1;
        System.out.print("Первые 11 членов последовательности Фибоначчи: ");
        for (int i = 1; i <= 11; i++) {
            System.out.print(x1 + " ");
            int x3 = x2 + x1;
            x1 = x2;
            x2 = x3;
        }
    }
}
