package homework9_OOP.classwork1;

import static homework9_OOP.classwork1.Flower.sum;
import static homework9_OOP.classwork1.Flower.count;

public class MainApp {
    public static void main(String[] args) {
        Flower[] flowers1 = {new Rose("BLR", 10, 50),
                new Tulip("UKR", 7, 35),
                new Carnation("NETH", 8, 75),
                new Chamomile("RU", 5, 20)};
        sumCost(flowers1);

        Flower[] flowers2 = {new Rose("BLR", 10, 50),
                new Rose("BLR", 10, 50),
                new Carnation("NETH", 8, 75),
                new Carnation("NETH", 8, 75)};
        sumCost(flowers2);

        Flower[] flowers3 = {new Chamomile("RU", 5, 20),
                new Tulip("UKR", 7, 35),
                new Tulip("UKR", 7, 35)};
        sumCost(flowers3);


    }

    public static void sumCost(Flower[] flowers) {
        for (int i = 0; i < flowers.length; i++) {
            sum += flowers[i].cost;
        }
        System.out.println("Общая сумма стоимости проданных цветов составила " + sum);
        System.out.println("Общее количество проданных цветов " + count);
    }
}
