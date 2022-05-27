package lesson14.task2;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        //создание и заполнение List
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("Mark", "male", 25));
        userArrayList.add(new User("Monica", "female", 35));
        userArrayList.add(new User("Kevin", "male", 37));
        userArrayList.add(new User("Anna", "female", 26));
        userArrayList.add(new User("Anna", "female", 28));
        userArrayList.add(new User("Lars", "male", 25));
        userArrayList.add(new User("Anna", "female", 25));
        userArrayList.add(new User("Alan", "male", 37));
        userArrayList.add(new User("Alex", "male", 25));
        userArrayList.add(new User("Alexa", "female", 25));

        //создание и заполнение Set
        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(new User("Harry", "male", 30));
        userTreeSet.add(new User("Jessica", "female", 30));
        userTreeSet.add(new User("Veronica", "female", 24));
        userTreeSet.add(new User("Jane", "female", 31));
        userTreeSet.add(new User("Peter", "male", 35));
        userTreeSet.add(new User("Rose", "female", 34));
        userTreeSet.add(new User("Harry", "male", 34));
        userTreeSet.add(new User("Rio", "male", 35));
        userTreeSet.add(new User("Lucy", "female", 36));
        userTreeSet.add(new User("Huan", "male", 41));

        //поиск по имени
        FindUserNameService findUserNameService = new FindUserNameService();
        findUserNameService.find(userArrayList, "Anna");
        findUserNameService.find(userArrayList, "Hector");
        System.out.println();
        findUserNameService.find(userTreeSet, "Harry");
        System.out.println();

        //создание коллекции на основе пола
        CollectionWithSexService collectionWithSexService = new CollectionWithSexService();
        collectionWithSexService.FindUserBySex(userArrayList, "male");
        collectionWithSexService.FindUserBySex(userTreeSet, "female");
        System.out.println();

        System.out.println(userArrayList); //вывод до сортировки
        Collections.sort(userArrayList); //сортировка
        System.out.println(userArrayList); //вывод после сортировки
        System.out.println();

    }
}
