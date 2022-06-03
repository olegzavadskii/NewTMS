package homework16.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(17);
        arrayList.add(24);
        arrayList.add(48);
        arrayList.add(66);
        arrayList.add(10);
        arrayList.add(14);
        arrayList.add(45);
        arrayList.add(4);
        arrayList.add(12);
        arrayList.add(21);
        arrayList.add(5);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(45);
        arrayList.add(8);
        arrayList.add(29);
        arrayList.add(18);
        arrayList.add(6);
        arrayList.add(41);
        arrayList.add(42);
        arrayList.add(14);
        arrayList.add(62);
        System.out.println(arrayList);

        //удаление дубликатов
        List<Integer> collect1 = arrayList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Коллекция без дубликатов " + collect1);

        //вывод четных элементов в диапазоне от 7 до 17 включительно
        List<Integer> integerStream = arrayList.stream()
                .filter(x -> x % 2 == 0 && x >= 7 && x <= 17)
                .collect(Collectors.toList());
        System.out.println("Четные элементы от 7 до 17 включительно " + integerStream);

        //умножение на 2
        List<Integer> collect2 = arrayList.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println("Все элементы увеличены в 2 раза " + collect2);

        //сортировка и вывод первых четырех элементов
        List<Integer> collect3 = arrayList.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Сортировка и вывод первых 4 элементов " + collect3);

        //вывод количества элементов
        long count = arrayList.stream().count();
        System.out.println("Количество элементов " + count);

        //вывод среднего арифметического
        OptionalDouble average = arrayList.stream()
                .mapToInt(Integer::intValue)
                .average();
        System.out.println("Среднее арифметическое " + average);


    }
}
