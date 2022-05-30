package homework2.task1;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя...");
        String line = scanner.nextLine();
        System.out.println("Hello, " + line + "!");
    }
}
