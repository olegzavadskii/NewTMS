package homework7_Interfaces_and_abstract_classes.task2;

public class Worker implements Int {
    private String position;

    public Worker(String position) {
        this.position = position;
    }

    @Override
    public void position() {
        System.out.printf("Я %s\n", this.position);
    }
}
