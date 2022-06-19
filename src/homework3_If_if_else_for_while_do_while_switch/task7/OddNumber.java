/*Вывод нечетных чисел с использованием цикла for*/

package homework3_If_if_else_for_while_do_while_switch.task7;

public class OddNumber {
    public static void main(String[] args) {
        int x = 1;
        for (; x <= 99; x++) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
    }
}
