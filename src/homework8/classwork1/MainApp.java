package homework8.classwork1;

import static homework8.classwork1.Book.printBooks;
import static homework8.classwork1.Magazine.printMagazines;

public class MainApp {
    public static void main(String[] args) {
        Printable[] arr = new Printable[6];
        arr[0] = new Book("The Dark Tower");
        arr[1] = new Magazine("Goal");
        arr[2] = new Book("Java");
        arr[3] = new Book("Harry Potter");
        arr[4] = new Magazine("Times");
        arr[5] = new Magazine("Mirror");

        for (int i = 0; i < arr.length; i++) {
            arr[i].print();
        }
        System.out.println();

        printMagazines(arr);
        System.out.println();

        printBooks(arr);
    }

}
