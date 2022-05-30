package homework7.task2;

public class MainApp {
    public static void main(String[] args) {
        Director person1 = new Director("Директор");
        Accountant person2 = new Accountant("Бухгалтер");
        Worker person3 = new Worker("Рабочий");
        person1.position();
        person2.position();
        person3.position();
    }
}
