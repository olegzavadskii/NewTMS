package homework16_Stream.task1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(17, 24, 48, 66, 10, 14, 45,
                4, 12, 21, 5, 16, 17, 45, 8, 29, 18, 6, 41, 42, 14, 62);
        System.out.println(arrayList);

        //удаление дубликатов
        List<Integer> collect1 = arrayList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Коллекция без дубликатов " + collect1);

        //вывод четных элементов в диапазоне от 7 до 17 включительно
        List<Integer> integerStream = arrayList.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x >= 7 && x <= 17)
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
