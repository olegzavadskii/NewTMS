/*Первые 10 чисел последовательности*/

package homework3_If_if_else_for_while_do_while_switch.task15;

public class Subsequence {
    public static void main(String[] args) {
        int x = 0;
        int b = 1;
        for (; b <= 10; x = x - 5, b++)
            System.out.print(x + " ");

    }
}
