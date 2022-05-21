package lesson11.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<String> dataBase = new ArrayList<>(5);
        Scanner scn = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Введите элемент для добавления в базу данных");
            String newWord = scn.next();
            dataBase.add(newWord);
            dataBase.remove("get");
            dataBase.remove("clear");
            dataBase.remove("exit");
            System.out.println("Элементы, содержащиеся в базе данных: " + dataBase);

            if (dataBase.size() >= 5) {
                try {
                    throw new FullArrException();
                } catch (FullArrException e) {
                    System.out.println("База данных заполнена. Введите clear для очищения базы данных");
                }
            }

            if (newWord.equals("get")) {
                if (dataBase.size() == 0) {
                    try {
                        throw new EmptyArrException();
                    } catch (EmptyArrException e) {
                        System.out.println("База данных пуста. Заполните базу данных");
                    }
                } else if (dataBase.size() > 0) {
                    System.out.println("Начальный элемент базы данных " + dataBase.get(0));
                    dataBase.remove(0);
                    dataBase.remove("get");
                    System.out.println("Элемент извлечен. Элементы, содержащиеся в базе данных: " + dataBase);
                }
            }

            if (newWord.equals("clear")) {
                dataBase.clear();
                System.out.println("База данных очищена. Заполните базу данных");
            }

            if (newWord.equals("exit")) {
                System.out.println("Элементы, содержащиеся в базе данных: " + dataBase);
                break;
            }
        }
    }
}
