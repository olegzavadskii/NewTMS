package homework14_Collections_and_Generics.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithUserNameService {
    public Collection<User> findUserByName(Collection<User> users, String name) {
        Iterator<User> iterator = users.iterator();
        Collection<User> listByName = new ArrayList<>();
        while (iterator.hasNext()) {
            User nextUser = iterator.next();
            if (nextUser.getName().equals(name)) {
                listByName.add(nextUser);
            }
        }
        return listByName;
    }
}