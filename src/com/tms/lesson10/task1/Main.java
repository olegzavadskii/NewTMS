package com.tms.lesson10.task1;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Greg", "Malcolm", 4);
        Worker worker2 = new Worker("Fred", "Born", 2);
        Worker worker3 = new Worker("Karl", "King", 3);
        Director director1 = new Director("Mike", "Leon", 3);
        Director director2 = new Director("Paul", "Sakic", 2);

        //расчет з/п
        worker1.raiseSalary();
        worker2.raiseSalary();
        worker3.raiseSalary();
        director1.raiseSalary();

        //вывод информации о сотрудниках
        System.out.println(worker1.toString() + "\n");
        System.out.println(worker2.toString() + "\n");
        System.out.println(worker3.toString() + "\n");
        System.out.println(director1.toString() + "\n");

        //установление двух работников в подчинение директору
        director1.setEmployee(worker1);
        director1.setEmployee(worker2);

        //перерасчет з/п с учетом подчиненных
        director1.raiseSalary();

        //вывод информации о первом директоре и о подчиненных
        director1.showInfo();

        //установление работника в подчинение второму директору
        director2.setEmployee(worker3);

        //установление в подчинение первому директору одного директора
        director1.setEmployee(director2);

        //перерасчет з/п с учетом подчиненных
        director2.raiseSalary();
        director1.raiseSalary();

        //вывод информации
        director2.showInfo();
        director1.showInfo();

        //поиск сотрудника в подчинении
        finderEmployee finderEmployee = new finderEmployee();
        finderEmployee.findEmployee(director1, "Wayne");
        finderEmployee.findEmployee(director1, "Greg");
        finderEmployee.findEmployee(director1, "Paul");
    }
}

