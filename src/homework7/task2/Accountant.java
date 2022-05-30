package homework7.task2;

public class Accountant implements Int {
    private String position;

    public Accountant(String position) {
        this.position = position;
    }

    @Override
    public void position() {
        System.out.printf("Я %s\n", this.position);
    }
}
