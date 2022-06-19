/*Таблица умножения*/

package homework3_If_if_else_for_while_do_while_switch.task5;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print(a * b + " ");
            }
            System.out.println();
        }
    }
}