package homework7_Interfaces_and_abstract_classes.task1;

public class MainApp {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("1", 10, 17, 25);
        Triangle t2 = new Triangle("2", 24, 30, 35);
        Rectangle r1 = new Rectangle("1", 25, 36);
        Rectangle r2 = new Rectangle("2", 37, 49);
        Circle c1 = new Circle("1", 42);
        createTriangle(t1);
        createTriangle(t2);
        createRectangle(r1);
        createRectangle(r2);
        createCircle(c1);

        Figure[] arr = new Figure[5];
        arr[0] = t1;
        arr[1] = t2;
        arr[2] = r1;
        arr[3] = r2;
        arr[4] = c1;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].p;
        }
        System.out.println("Сумма периметров всех фигур в массиве составляет " + sum);
    }

    public static void createTriangle(Triangle t1) {
        t1.getPerimeter();
        t1.getSquare();
        System.out.println();
    }

    public static void createRectangle(Rectangle r1) {
        r1.getPerimeter();
        r1.getSquare();
        System.out.println();
    }

    public static void createCircle(Circle c1) {
        c1.getPerimeter();
        c1.getSquare();
        System.out.println();
    }

}