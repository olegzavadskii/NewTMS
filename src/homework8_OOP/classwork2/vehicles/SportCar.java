package homework8_OOP.classwork2.vehicles;

import homework8_OOP.classwork2.details.Engine;
import homework8_OOP.classwork2.professions.Driver;

public class SportCar extends Car {
    protected int speed;

    public SportCar(String brand, String klass, int weight, Driver driver, Engine engine, int speed) {
        super(brand, klass, weight, driver, engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                ", brand='" + brand + '\'' +
                ", klass='" + klass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                "speed=" + speed +
                '}';
    }
}
