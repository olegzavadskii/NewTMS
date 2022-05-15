package Task10;

public class Director extends Employee {
    public Director(Position position, String firstName, String secondName, int years) {
        super(position, firstName, secondName, years);
    }

    //метод для назначения сотрудников
    public void setEmployee(Employee...var) {

    }

    //метод для расчета з/п, учитывающий количество подчиненных
    public double raiseSalary(Employee...var) {
        return this.finalSalary = super.raiseSalary() + baseSalary * var.length;
    }

    //метод для вывода информации о директоре и подчиненных
    public static void showInfo(Employee... var) {
        for (int i = 0; i < var.length; i++) {
            System.out.println(var[i].toString() + "\n");
        }
    }
}
