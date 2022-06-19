package homework8_OOP.classwork2.details;

public class Engine {
    protected int power;
    protected String producer;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", producer='" + producer + '\'' +
                '}';
    }
}
