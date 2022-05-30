/*Проверка числа на четность*/

package homework3.task3;

public class EvenNumber {
    public static void main(String[] args) {
        long x = 454215452441561L;
        double balance = x % 2;
        if (balance == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}
