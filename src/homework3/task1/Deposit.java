/*Вычисление суммы вклада с капитализацией процентов*/

package homework3.task1;

public class Deposit {
    public static void main(String[] args) {
        float sum = 100; //ввести сумму вклада
        int month = 12; //ввести количество месяцев
        double percent = 0.07; //ввести значение процента
        int x = 0;
        for (; x <= month; x++, sum = (float) (sum * (percent + 1))) {
            System.out.println("Через " + x + " месяцев итоговая сумма вклада составит " + sum);
        }
    }
}
