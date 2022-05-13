package Task10;

public class Director extends Employee {
    public Director(Position position, String firstName, String secondName, int years) {
        super(position, firstName, secondName, years);
    }

    //метод для назначения сотрудников
    public void setEmployee(Employee[] array) {

    }

    //метод для расчета з/п, учитывающий количество подчиненных
    public double raiseSalary(Employee[] array) {
        return this.finalSalary = super.raiseSalary() + baseSalary * array.length;
    }

    //метод для вывода информации о директоре и подчиненных
    public static void showInfo(Director director, Employee[] array) {
        System.out.println(director.toString() + "\n");
        for (int i = 0; i < array.length; i++) {
            array[i].raiseSalary();
            System.out.println(array[i].toString() + "\n");
        }
    }

}
