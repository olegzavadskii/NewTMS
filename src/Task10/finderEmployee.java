package Task10;

public class finderEmployee {

    //метод для поиска сотрудника в подчинении
    public static void findEmployee(String firstName, Employee... var) {
        exit:
        {
            for (int i = 0; i < var.length; i++) {
                if (var[i].firstName == firstName) {
                    System.out.println("Сотрудник с указанным именем находится в подчинении");
                    break exit;
                }
            }
            System.out.println("Сотрудник с указанным именем отсутствует в подчинении");
        }
    }
}
