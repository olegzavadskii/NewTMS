/*Первые 10 чисел последовательности*/

package homework3.task15;

public class Subsequence {
    public static void main(String[] args) {
        int x = 0;
        int b = 1;
        for (; b <= 10; x = x - 5, b++)
            System.out.print(x + " ");

    }
}
