package Task10;

import static Task10.finderEmployee.findEmployee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker(Position.WORKER, "Greg",
                "Malcolm", 4);
        Worker worker2 = new Worker(Position.WORKER, "Fred",
                "Born", 2);
        Worker worker3 = new Worker(Position.WORKER, "Karl",
                "King", 3);
        Director director1 = new Director(Position.DIRECTOR, "Mike",
                "Leon", 3);
        Director director2 = new Director(Position.DIRECTOR, "Paul",
                "Sakic", 2);

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
        director1.setEmployee(worker1, worker2);
        //перерасчет з/п с учетом подчиненных
        director1.raiseSalary(worker1, worker2);
        //вывод информации о первом директоре и о подчиненных
        Director.showInfo(director1, worker1, worker2);

        //установление работника в подчинение второму директору
        director2.setEmployee(worker3);

        //установление в подчинение первому директору двух работников и одного директора
        director1.setEmployee(worker1, worker2, director2);

        //перерасчет з/п с учетом подчиненных
        director2.raiseSalary(worker3);
        director1.raiseSalary(worker1, worker2, director2);

        //вывод информации
        Director.showInfo(director2, worker3);
        Director.showInfo(director1, worker1, worker2, director2);

        //поиск сотрудника в подчинении
        findEmployee("Mike", worker1, worker2, director2);

    }

}

