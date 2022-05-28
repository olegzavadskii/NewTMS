package lesson14.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithSexService {

    public void FindUserBySex(Collection<User> users, Sex sex) {
        Iterator<User> iterator = users.iterator();
        Collection<User> listBySex = new ArrayList<>();
        while (iterator.hasNext()) {
            User nextUser = iterator.next();
            if (nextUser.getSex().equals(sex)) {
                listBySex.add(nextUser);
            }
        }
        System.out.println(listBySex);
    }

}
