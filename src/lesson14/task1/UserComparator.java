package lesson14.task1;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
