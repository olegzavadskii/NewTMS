package homework6_Classes_and_methods.task3;

public class MainApp {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        System.out.println();
        card1.setNumber(1);
        card1.setBalance(143);
        card2.setNumber(2);
        card2.setBalance(0);
        card3.setNumber(3);
        card3.setBalance(9751);

        card1.addition(200);
        System.out.println();
        card2.addition(200);
        System.out.println();
        card3.decrease(9800);
        System.out.println();
        card1.info();
        card2.info();
        card3.info();
    }

}
