package Task10;

public abstract class Employee {
    protected Position position;
    protected String firstName;
    protected String secondName;
    protected double years;
    protected double baseSalary = 1000;
    protected double finalSalary;

    public Employee(Position position, String firstName, String secondName, int years) {
        this.position = position;
        this.firstName = firstName;
        this.secondName = secondName;
        this.years = years;
    }

    //метод для расчета з/п
    public double raiseSalary() {
        finalSalary = baseSalary * this.position.getCoefficient() * years;
        return finalSalary;
    }

    public String toString() {
        return "Должность " + this.position + "\nИмя " + this.firstName + "\nФамилия " + this.secondName +
                "\nСтаж " + this.years + " года\nЗ/п " + this.finalSalary;
    }

}

