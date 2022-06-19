package homework8_OOP.classwork2;

import homework8_OOP.classwork2.details.Engine;
import homework8_OOP.classwork2.professions.Driver;
import homework8_OOP.classwork2.vehicles.Car;
import homework8_OOP.classwork2.vehicles.SportCar;

public class MainApp {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Oleg", 5);
        Engine engine1 = new Engine(105, "VW");
        Car car1 = new Car("VW", "sedan", 1600, driver1, engine1);
        SportCar sportCar1 = new SportCar("Ferrari", "sport", 1100, driver1,
                new Engine(500, "Ferrari"), 250);
        car1.start();
        car1.stop();
        car1.turnRight();
        car1.turnLeft();
        System.out.println();
        sportCar1.start();
        sportCar1.stop();
        sportCar1.turnRight();
        sportCar1.turnLeft();
        System.out.println();
        System.out.println(sportCar1.toString());

    }
}
