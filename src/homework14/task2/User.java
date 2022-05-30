package homework14.task2;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private Sex sex;
    private int age;

    public User() {
    }

    public User(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(User user) {
        if (this.getAge() > user.getAge()) {
            return 1;
        } else if (this.getAge() < user.getAge()) {
            return -1;
        } else {
            if (this.name.equals(user.getName())) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
