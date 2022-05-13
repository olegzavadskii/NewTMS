package Task10;

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
                "Sakic", 3);

        Employee[] array1 = {worker1, worker2};
        Employee[] array2 = {worker3};

        //установление работников в подчинение директору
        director1.setEmployee(array1);
        director2.setEmployee(array2);

        //перерасчет з/п с учетом подчиненных
        director1.raiseSalary(array1);
        director2.raiseSalary(array2);

        //вывод информации о директоре и о подчиненных
        Director.showInfo(director1, array1);
        Director.showInfo(director2, array2);

    }

}

