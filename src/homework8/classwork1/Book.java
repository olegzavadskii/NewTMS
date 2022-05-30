package homework8.classwork1;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Это книга под названием " + name);
    }

    public static void printBooks(Printable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Book) {
                arr[i].print();
            }
        }
    }

}
