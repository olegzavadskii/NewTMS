package com.tms.lesson10.task1;

import java.util.Arrays;

public class Director extends Employee {
    protected Employee[] listOfSubordinates;
    private int i = 0;

    public Director(String firstName, String secondName, int years) {
        super(firstName, secondName, years);
        this.position = Position.DIRECTOR;
        this.listOfSubordinates = new Employee[i];
    }

    //метод для назначения сотрудников
    // также автоматически идет пересчет з/п с учетом количества подчиненных
    public Employee[] addEmployee(Employee employee) {
        listOfSubordinates = Arrays.copyOf(listOfSubordinates, listOfSubordinates.length + 1);
        listOfSubordinates[listOfSubordinates.length - 1] = employee;
        this.raiseSalary();
        return listOfSubordinates;
    }

    //метод для расчета з/п, учитывающий количество подчиненных
    public double raiseSalary() {
        return this.finalSalary = super.raiseSalary() + baseSalary * this.listOfSubordinates.length;
    }

    //метод для вывода информации о директоре и подчиненных
    @Override
    public String toString() {
        for (Employee emp : this.listOfSubordinates) {
            System.out.println(emp.toString() + "\n");
        }
        return "Должность " + this.position + "\nИмя " + this.firstName + "\nФамилия " + this.secondName +
                "\nСтаж " + this.years + " года\nЗ/п " + this.finalSalary;
    }
}