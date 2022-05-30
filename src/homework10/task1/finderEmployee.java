package homework10.task1;

public class finderEmployee {

    private boolean success;

    //метод для поиска сотрудника в подчинении
    public boolean findEmployee(Director director, String firstName) {
        for (Employee emp : director.listOfSubordinates) {
            if (emp.getPosition() == Position.WORKER) {
                if (emp.getFirstName().equals(firstName)) {
                    System.out.println("Сотрудник находится в подчинении");
                    success = true;
                    break;
                }
            } else {
                if (emp.getFirstName().equals(firstName)) {
                    System.out.println("Сотрудник находится в подчинении");
                    success = true;
                    break;
                } else {
                    findEmployee((Director) emp, firstName);
                    if (!success) {
                        System.out.println("Сотрудник не найден");
                    }
                }
            }
        }
        return success;
    }
}
