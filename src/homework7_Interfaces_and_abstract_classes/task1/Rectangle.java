package homework7_Interfaces_and_abstract_classes.task1;

public class Rectangle extends Figure {

    public Rectangle(String num, double a, double b) {
        this.num = num;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        p = a + a + b + b;
        System.out.println("Периметр прямоугольника №" + num + " составляет " + p);
        return p;
    }

    @Override
    public double getSquare() {
        s = a * b;
        System.out.println("Площадь прямоугольника №" + num + " составляет " + s);
        return s;
    }
}
