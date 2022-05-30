package homework7.task2;

public class Director implements Int {
    private String position;

    public Director(String position) {
        this.position = position;
    }

    @Override
    public void position() {
        System.out.printf("Я %s\n", this.position);
    }
}
