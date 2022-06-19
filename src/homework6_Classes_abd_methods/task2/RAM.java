package homework6_Classes_abd_methods.task2;

public class RAM {
    private String name;
    private int storage;

    public RAM() {
    }

    public RAM(String name, int storage) {
        this.name = name;
        this.storage = storage;
        System.out.println(this.name + ", " + this.storage);
    }
}
