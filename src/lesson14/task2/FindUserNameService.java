package lesson14.task2;

import java.util.Collection;
import java.util.Iterator;

public class FindUserNameService {

    public void find(Collection<User> users, String name) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User nextUser = iterator.next();
            if (nextUser.getName().equals(name)) {
                System.out.println(nextUser);
            }
        }
    }
}