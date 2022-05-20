package Task1;

import java.io.*;

public class MainAppTask1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user1 = new User("User", "MainUser", 26);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:\\JAVA\\HomeWork\\Lesson12\\src\\Task1\\user.dat"));
        oos.writeObject(user1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\JAVA\\HomeWork\\Lesson12\\src\\Task1\\user.dat"));
        Object obj = ois.readObject();

        if (obj instanceof User) {
            User newUser = (User) obj;
            System.out.println(newUser);
        }

        ois.close();
    }
}
