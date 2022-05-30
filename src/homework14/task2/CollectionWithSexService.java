package homework14.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionWithSexService {

    public Collection<User> findUserBySex(Collection<User> users, Sex sex) {
        Iterator<User> iterator = users.iterator();
        Collection<User> listBySex = new ArrayList<>();
        while (iterator.hasNext()) {
            User nextUser = iterator.next();
            if (nextUser.getSex().equals(sex)) {
                listBySex.add(nextUser);
            }
        }
        return listBySex;
    }

}
