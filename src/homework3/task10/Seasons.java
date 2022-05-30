/*Вывод названия поры года по номеру месяца через if-else-if*/

package homework3.task10;

public class Seasons {
    public static void main(String[] args) {
        int m = 12;
        if (m >= 1 & m <= 2) {
            System.out.println("Зима");
        } else {
            if (m >= 3 & m <= 5) {
                System.out.println("Весна");
            } else {
                if (m >= 6 & m <= 8) {
                    System.out.println("Лето");
                } else {
                    if (m >= 9 & m <= 11) {
                        System.out.println("Осень");
                    } else {
                        if (m == 12) {
                            System.out.println("Зима");
                        } else {
                            if (m >= 13) {
                                System.out.println("Введите число от 1 до 12");
                            }
                        }
                    }
                }
            }
        }
    }
}