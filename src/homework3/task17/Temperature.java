/*Оценка к температуре на улице)*/

package homework3.task17;

public class Temperature {
    public static void main(String[] args) {
        int t = -21;
        if (t > -5) {
            System.out.println("Тепло");
        } else {
            if (t <= -5 & t > -20) {
                System.out.println("Нормально");
            } else {
                if (t <= -20) {
                    System.out.println("Холодно");
                }
            }

        }
    }
}
