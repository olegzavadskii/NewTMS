package homework7.task1;

public class Triangle extends Figure {

    public Triangle(String num, double a, double b, double c) {
        this.num = num;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        p = a + b + c;
        System.out.println("Периметр треугольника №" + num + " составляет " + p);
        return p;
    }

    @Override
    public double getSquare() {
        double halfP = p / 2;
        s = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c));
        System.out.println("Площадь треугольника №" + num + " составляет " + s);
        return s;
    }
}
