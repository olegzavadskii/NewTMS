package homework9.task2;

public class Vector {
    private int x;
    private int y;

    public Vector() {
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //метод вычисления длины вектора
    public void length() {
        int length = (int) Math.sqrt(this.x * this.x + this.y * this.y);
        System.out.println("Длина вектора составляет " + length);
    }

    //метод сравнения векторов
    public void compare(Vector vector2) {
        int length1 = (int) Math.sqrt(this.x * this.x + this.y * this.y);
        int length2 = (int) Math.sqrt(vector2.x * vector2.x + vector2.y * vector2.y);
        if (length1 == length2) {
            System.out.println("Вектор 1 равен вектору 2");
        } else if (length1 > length2) {
            System.out.println("Вектор 1 больше вектора 2");
        } else if (length1 < length2) {
            System.out.println("Вектор 1 меньше вектора 2");
        }
    }

    //метод вычисления скалярного произведения
    public void scalar(Vector vector2) {
        int scal = this.x * vector2.x + this.y * vector2.y;
        System.out.println("Скалярное произведение двух векторов составляет " + scal);
    }

    //метод сложения векторов
    public void plusVector(Vector vector2) {
        int sumX = this.x + vector2.x;
        int sumY = this.y + vector2.y;
        System.out.printf("Сумма векторов равна (%d; %d)\n", sumX, sumY);
    }

    //метод разности векторов
    public void minusVector(Vector vector2) {
        int diffX = this.x - vector2.x;
        int diffY = this.y - vector2.y;
        System.out.printf("Разность векторов равна (%d; %d)\n", diffX, diffY);
    }

    //метод вывода информации о векторе
    @Override
    public String toString() {
        return "Vector {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
