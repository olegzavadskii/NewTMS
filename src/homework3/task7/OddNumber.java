/*Вывод нечетных чисел с использованием цикла for*/

package homework3.task7;

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
