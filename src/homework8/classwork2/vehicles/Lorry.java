package homework8.classwork2.vehicles;

import homework8.classwork2.details.Engine;
import homework8.classwork2.professions.Driver;

public class Lorry extends Car {
    protected int capacity;

    public Lorry(String brand, String klass, int weight, Driver driver, Engine engine, int capacity) {
        super(brand, klass, weight, driver, engine);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", klass='" + klass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
