package homework6.task1;

public class ATM {
    private double sum;

    public ATM(int twenty, int fifty, int oneHundred) {
        this.sum = twenty * 20 + fifty * 50 + oneHundred * 100;
        System.out.printf("В банкомате %s рублей\n", this.sum);

    }

    public void plus(int twenty, int fifty, int oneHundred) { //пополнение банкомата по количеству купюр
        double x = twenty * 20 + fifty * 50 + oneHundred * 100;
        this.sum = this.sum + x;
        System.out.printf("Вы добавили в банкомат %s рублей\n", x);
        System.out.printf("В банкомате %s рублей\n", this.sum);
    }

    public boolean minus(double amount) { //снятие денежных средств
        boolean success = false;
        if (amount <= this.sum) {
            this.sum -= amount;
            System.out.println("Снятие средств завершено успешно");
            success = true;
        } else {
            System.out.println("Ошибка. Недостаточно средств");
        }
        return success;
    }
}
