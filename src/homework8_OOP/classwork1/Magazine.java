package homework8_OOP.classwork1;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Это журнал под названием " + name);
    }

    public static void printMagazines(Printable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Magazine) {
                arr[i].print();
            }
        }
    }

}
