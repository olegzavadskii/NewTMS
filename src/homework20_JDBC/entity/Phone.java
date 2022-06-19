package homework20_JDBC.entity;

public class Phone {
    private int id;
    private Brand brand;
    private String model;
    private double diagonal;
    private double storage;

    public Phone() {
    }

    public Phone(Brand brand, String model, double diagonal, double storage) {
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
        this.storage = storage;
    }

    public Phone(int id, Brand brand, String model, double diagonal, double storage) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
        this.storage = storage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", brand=" + brand +
                ", model='" + model + '\'' +
                ", diagonal=" + diagonal +
                ", storage=" + storage +
                '}' + "\n";
    }
}