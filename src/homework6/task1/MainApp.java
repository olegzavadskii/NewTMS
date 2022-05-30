package homework6.task1;

public class MainApp {
    public static void main(String[] args) {
        ATM atm1 = new ATM(5, 5, 5);
        ATM atm2 = new ATM(1, 1, 1);
        atm1.plus(5, 5, 5);
        atm2.plus(1, 1, 1);
        atm1.minus(1750);
        atm2.minus(340);

    }

}