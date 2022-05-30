package homework10.task1;

public class Worker extends Employee {

    public Worker(String firstName, String secondName, int years) {
        super(firstName, secondName, years);
        this.position = Position.WORKER;
    }

}

