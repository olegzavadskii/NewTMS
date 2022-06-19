package homework14_Collections_and_Generics.task2;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        //создание и заполнение List
        List<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("Mark", Sex.MALE, 25));
        userArrayList.add(new User("Monica", Sex.FEMALE, 35));
        userArrayList.add(new User("Kevin", Sex.MALE, 37));
        userArrayList.add(new User("Anna", Sex.FEMALE, 26));
        userArrayList.add(new User("Anna", Sex.FEMALE, 28));
        userArrayList.add(new User("Lars", Sex.MALE, 25));
        userArrayList.add(new User("Anna", Sex.FEMALE, 25));
        userArrayList.add(new User("Alan", Sex.MALE, 37));
        userArrayList.add(new User("Alex", Sex.MALE, 25));
        userArrayList.add(new User("Alexa", Sex.FEMALE, 25));

        //создание и заполнение Set
        Set<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(new User("Harry", Sex.MALE, 30));
        userTreeSet.add(new User("Jessica", Sex.FEMALE, 30));
        userTreeSet.add(new User("Veronica", Sex.FEMALE, 24));
        userTreeSet.add(new User("Jane", Sex.FEMALE, 31));
        userTreeSet.add(new User("Peter", Sex.MALE, 35));
        userTreeSet.add(new User("Rose", Sex.FEMALE, 34));
        userTreeSet.add(new User("Harry", Sex.MALE, 34));
        userTreeSet.add(new User("Rio", Sex.MALE, 35));
        userTreeSet.add(new User("Lucy", Sex.FEMALE, 36));
        userTreeSet.add(new User("Huan", Sex.MALE, 41));

        //поиск по имени
        CollectionWithUserNameService findUserNameService = new CollectionWithUserNameService();
        System.out.println(findUserNameService.findUserByName(userArrayList, "Anna"));
        System.out.println(findUserNameService.findUserByName(userArrayList, "Hector"));
        System.out.println();
        System.out.println(findUserNameService.findUserByName(userTreeSet, "Harry"));
        System.out.println();

        //создание коллекции на основе пола
        CollectionWithSexService collectionWithSexService = new CollectionWithSexService();
        System.out.println(collectionWithSexService.findUserBySex(userArrayList, Sex.MALE));
        System.out.println(collectionWithSexService.findUserBySex(userTreeSet, Sex.FEMALE));
        System.out.println();

        System.out.println(userArrayList); //вывод до сортировки
        Collections.sort(userArrayList); //сортировка
        System.out.println(userArrayList); //вывод после сортировки

    }
}
