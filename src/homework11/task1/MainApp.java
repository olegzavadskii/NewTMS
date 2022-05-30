package homework11.task1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        UserRepositary ur = new UserRepositary();
        Scanner scn = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Введите элемент для добавления в базу данных");
            String newWord = scn.next();
            ur.addToDataBase(newWord);
            ur.deleteFromDataBase("get");
            ur.deleteFromDataBase("clear");
            ur.deleteFromDataBase("exit");
            System.out.println("Элементы, содержащиеся в базе данных: " + ur.toString());

            try {
                ur.validateToFull();
            } catch (FullArrException e) {
                System.out.println(e.getMessage());
            }

            try {
                ur.validateToEmpty();
            } catch (EmptyArrException e) {
                System.out.println(e.getMessage());
                continue;
            }

            if (newWord.equals("get")) {
                ur.deleteFromDataBase("get");
                System.out.println("Начальный элемент базы данных " + ur.getDataBase().get(0));
                ur.getDataBase().remove(0);
                System.out.println("Элемент извлечен. Элементы, содержащиеся в базе данных: " + ur.toString());
            }

            if (newWord.equals("clear")) {
                ur.getDataBase().clear();
                System.out.println("База данных очищена. Заполните базу данных");
            }

            if (newWord.equals("exit")) {
                break;
            }
        }
    }
}
