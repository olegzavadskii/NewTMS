/*Определить цвет радуги по введенному числу*/

package homework3.task8;

public class Rainbow {
    public static void main(String[] args) {
        int x = 7;
        switch (x) {
            case (1):
                System.out.println("Красный");
                break;
            case (2):
                System.out.println("Оранжевый");
                break;
            case (3):
                System.out.println("Желтый");
                break;
            case (4):
                System.out.println("Зеленый");
                break;
            case (5):
                System.out.println("Голубой");
                break;
            case (6):
                System.out.println("Синий");
                break;
            case (7):
                System.out.println("Фиолетовый");
                break;
            default:
                System.out.println("В радуге 7 цветов. Введите число от 1 до 7");
        }
    }

}
