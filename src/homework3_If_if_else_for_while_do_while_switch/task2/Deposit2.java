/*Вычисление суммы вклада без капитализации*/

package homework3_If_if_else_for_while_do_while_switch.task2;

public class Deposit2 {
    public static void main(String[] args) {
        float sum = 200; //ввести сумму вклада
        int month = 12; //ввести количество месяцев
        double percent=0.07; //ввести значение процента
        int x = 0;
        float newSum=sum;
        for (; x <= month; x++, newSum = (float) (sum*percent*x)+sum) {
            System.out.println("Через " + x + " месяцев итоговая сумма вклада составит " + newSum);
        }
    }
}