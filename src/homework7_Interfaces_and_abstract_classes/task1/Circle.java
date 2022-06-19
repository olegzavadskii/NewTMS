package homework7_Interfaces_and_abstract_classes.task1;

public class Circle extends Figure {

    public Circle(String num, double r) {
        this.num = num;
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        p = 2 * Math.PI * r;
        System.out.println("Периметр (длина окружности) круга №" + num + " составляет " + p);
        return p;
    }

    @Override
    public double getSquare() {
        s = Math.PI * r * r;
        System.out.println("Площадь круга №" + num + " составляет " + s);
        return s;
    }
}
