package com.tms.lesson10.task1;

import java.util.Arrays;

public class Director extends Employee {
    protected Employee[] listOfSubordinates;

    public Director(String firstName, String secondName, int years) {
        super(firstName, secondName, years);
        this.position = Position.DIRECTOR;
        this.listOfSubordinates = new Employee[0];
    }

    //метод для назначения сотрудников
    public Employee[] setEmployee(Employee employee) {
        listOfSubordinates = Arrays.copyOf(listOfSubordinates, listOfSubordinates.length + 1);
        listOfSubordinates[listOfSubordinates.length - 1] = employee;
        return listOfSubordinates;
    }

    //метод для расчета з/п, учитывающий количество подчиненных
    public double raiseSalary() {
        return this.finalSalary = super.raiseSalary() + baseSalary * this.listOfSubordinates.length;
    }

    //метод для вывода информации о директоре и подчиненных
    public void showInfo() {
        System.out.println(this.toString() + "\n");
        for (Employee emp : this.listOfSubordinates) {
            System.out.println(emp.toString() + "\n");
        }
    }
}