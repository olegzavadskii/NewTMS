package homework8_OOP.classwork2.professions;

import homework8_OOP.classwork2.common.Person;

public class Driver extends Person {
    protected int years;

    public Driver(String name, int years) {
        super(name);
        this.years = years;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "years=" + years +
                ", name='" + name + '\'' +
                '}';
    }
}
