package homework6.task3;

public class CreditCard {
    private int number;
    private double balance;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    //зачисление суммы
    public void addition(double plus) {
        if (plus > 0) {
            this.balance = this.balance + plus;
            System.out.println("Баланс на карте №" + getNumber() + " после зачисления составляет " + getBalance());
        } else {
            System.out.println("Ошибка. Введите сумму больше 0");
        }
    }

    //снятие суммы
    public void decrease(double minus) {
        if (this.balance >= minus) {
            this.balance = this.balance - minus;
            System.out.println("Снятие завершено успешно. Баланс на карте №" + getNumber() + " после снятия средств составляет " + getBalance());
        } else {
            System.out.println("Ошибка. Недостаточно средств");
        }
    }

    //Вывод информации о карте
    public void info() {
        System.out.println("На карте №" + getNumber() + " остаток составляет " + getBalance());
    }
}
