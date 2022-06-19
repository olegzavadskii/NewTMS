package homework8_OOP.task2;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "{" +
                "Номер='" + number + '\'' +
                ", Модель='" + model + '\'' +
                ", Вес=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.printf("Звонит %s\n", name);
    }

    public void receiveCall(String name, String number) {
        System.out.printf("Звонит %s, номер %s\n", name, number);
    }

    public void sendMessage(String... vars) {
        for (String i : vars) {
            System.out.println(i);
        }
    }
}
