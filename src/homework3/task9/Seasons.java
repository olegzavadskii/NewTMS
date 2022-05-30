/*Вывод поры года по номеру месяца через switch-case*/

package homework3.task9;

public class Seasons {

    public static void main(String[] args) {
        String M1 = "Winter", M2 = "Winter", M12 = "Winter";
        String M3 = "Spring", M4 = "Spring", M5 = "Spring";
        String M6 = "Summer", M7 = "Summer", M8 = "Summer";
        String M9 = "Autumn", M10 = "Autumn", M11 = "Autumn";

        switch (M1) {
            case "Winter":
                System.out.println("Winter");
                break;
            case "Spring":
                System.out.println("Spring");
                break;
            case "Summer":
                System.out.println("Summer");
                break;
            case "Autumn":
                System.out.println("Autumn");
                break;
            default:
                System.out.println();

        }

    }
}
