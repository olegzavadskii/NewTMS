package com.tms.lesson10.task1;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Worker1", "Worker1", 4);
        Worker worker2 = new Worker("Worker2", "Worker2", 2);
        Worker worker3 = new Worker("Worker3", "Worker3", 3);
        Director director1 = new Director("Director1", "Director1", 3);
        Director director2 = new Director("Director2", "Director2", 2);

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
        director1.addEmployee(worker1);
        director1.addEmployee(worker2);

        //вывод информации о первом директоре и о подчиненных
        System.out.println(director1.toString() + "\n");

        //установление работника в подчинение второму директору
        director2.addEmployee(worker3);

        //установление в подчинение первому директору одного директора
        director1.addEmployee(director2);

        //вывод информации
        System.out.println(director2.toString() + "\n");
        System.out.println(director1.toString() + "\n");

        //поиск сотрудника в подчинении
        finderEmployee finderEmployee = new finderEmployee();
        finderEmployee.findEmployee(director1, "Worker4");
        finderEmployee.findEmployee(director1, "Worker1");
        finderEmployee.findEmployee(director1, "Director2");
    }
}