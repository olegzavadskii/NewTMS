package homework6_Classes_abd_methods.task2;

public class HDD {
    private String name;
    private int storage;
    private String type;

    public HDD() {
    }

    public HDD(String name, int storage, String type) {
        this.name = name;
        this.storage = storage;
        this.type = type;
        System.out.println(this.name + ", " + this.storage + ", " + this.type);
    }
}
