package lesson14.task1;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("User1", 20));
        users.add(new User("User2", 15));
        users.add(new User("User3", 57));
        users.add(new User("User4", 24));
        users.add(new User("User5", 37));
        users.add(new User("User6", 41));
        users.add(new User("User7", 42));
        users.add(new User("User8", 35));
        users.add(new User("User9", 15));
        users.add(new User("User10", 9));


        System.out.println(users);

        users.sort(new UserComparator());

        System.out.println(users);
    }
}
