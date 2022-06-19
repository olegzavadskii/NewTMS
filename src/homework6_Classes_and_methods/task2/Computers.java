package homework6_Classes_and_methods.task2;

public class Computers {
    private int cost;
    private String model;
    private int RAM;
    private int HDD;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public Computers(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }

    public Computers(int cost, String model, int RAM, int HDD) {
        this.cost = cost;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public void info1() {
        System.out.printf("My cost is %s. I am %s model", this.cost, this.model);
    }

    public void info2() {
        System.out.printf("My cost is %s. I am %s model. My RAM is %s. My HDD is %s", this.cost, this.model, this.RAM, this.HDD);
    }

}
