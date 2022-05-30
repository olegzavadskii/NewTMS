package homework8.classwork2.vehicles;

import homework8.classwork2.details.Engine;
import homework8.classwork2.professions.Driver;

public class Car {
    protected String brand;
    protected String klass;
    protected int weight;
    protected Driver driver;
    protected Engine engine;

    public Car(String brand, String klass, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.klass = klass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }


    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Car {" +
                "brand='" + brand + '\'' +
                ", klass='" + klass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
