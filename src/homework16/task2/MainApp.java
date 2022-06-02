package homework16.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        List<Family> families = Arrays.asList(
                new Family("family1", "theFirstStreet", 1400,
                        Arrays.asList(
                                new Child("child11", 14, Sex.MALE),
                                new Child("child12", 20, Sex.FEMALE),
                                new Child("child13", 6, Sex.MALE))),

                new Family("family2", "theSecondStreet", 1200,
                        Arrays.asList(
                                new Child("child21", 8, Sex.MALE),
                                new Child("child22", 8, Sex.FEMALE)
                        )),

                new Family("family3", "theThirdStreet", 1600,
                        Arrays.asList(
                                new Child("child31", 4, Sex.MALE),
                                new Child("child32", 7, Sex.FEMALE)
                        )));


        //Сгенерировать map где ключ - фамилия семьи, а значение - размер зп
        Map<String, Integer> collect = families.stream()
                .collect(Collectors.toMap(Family::getSname, Family::getSalary));
        System.out.println(collect);

        //количество мальчиков среди всех семей
        long count = families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.getSex() == Sex.MALE)
                .count();
        System.out.println(count);

        //вывести всех девочек
        List<Child> collect2 = families.stream()
                .flatMap(family -> family.getChildren().stream())
                .filter(child -> child.getSex() == Sex.FEMALE)
                .collect(Collectors.toList());
        System.out.println(collect2);

        //сколько у каждой семьи детей
        List<Integer> collect1 = families.stream()
                .map(family -> family.getChildren().size())
                .collect(Collectors.toList());
        System.out.println(collect1);

        //есть ли хоть одна семья у которой есть ребенок с именем...
        boolean b = families.stream()
                .flatMap(family -> family.getChildren().stream())
                .anyMatch(child -> child.getName().equals("child22"));
        System.out.println(b);

    }
}
