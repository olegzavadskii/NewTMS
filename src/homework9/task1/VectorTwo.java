package homework9.task1;

public class VectorTwo implements Inter {
    private int x;
    private int y;
    public static final String INFO = "Это вектор для двумерной системы координат";

    public VectorTwo() {
    }

    public VectorTwo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //метод вычисления длины
    @Override
    public void length() {
        int lengthTwo = (int) Math.sqrt(this.x * this.x + this.y * this.y);
        System.out.println("Длина вектора составляет " + lengthTwo);
    }

    //метод сравнения векторов
    public void compare(VectorTwo vector2) {
        int lengthTwo1 = (int) Math.sqrt(this.x * this.x + this.y * this.y);
        int lengthTwo2 = (int) Math.sqrt(vector2.x * vector2.x + vector2.y * vector2.y);
        if (lengthTwo1 == lengthTwo2) {
            System.out.println("Вектор 1 равен вектору 2");
        } else if (lengthTwo1 > lengthTwo2) {
            System.out.println("Вектор 1 больше вектора 2");
        } else if (lengthTwo1 < lengthTwo2) {
            System.out.println("Вектор 1 меньше вектора 2");
        }
    }

    //метод вычисления скалярного произведения
    public void scalarTwo(VectorTwo vector2) {
        int scalTwo = this.x * vector2.x + this.y * vector2.y;
        System.out.println("Скалярное произведение двух векторов составляет " + scalTwo);
    }

    //метод сложения векторов
    public void plusVectorTwo(VectorTwo vector2) {
        int sumX = this.x + vector2.x;
        int sumY = this.y + vector2.y;
        System.out.printf("Сумма векторов равна (%d; %d)\n", sumX, sumY);
    }

    //метод разности векторов
    public void minusVectorTwo(VectorTwo vector2) {
        int diffX = this.x - vector2.x;
        int diffY = this.y - vector2.y;
        System.out.printf("Разность векторов равна (%d; %d)\n", diffX, diffY);
    }

    //метод для вывода информации о векторе
    @Override
    public String toString() {
        return "VectorTwo {" +
                "x=" + x +
                ", y=" + y +
                "}. " + INFO;
    }

    //создание массива с векторами
    public static void createArrayTwo(int N) {
        VectorTwo[] arrTwo = new VectorTwo[N];
        for (int i = 0; i < N; i++) {
            VectorTwo vector = new VectorTwo();
            vector.setX((int) (Math.random() * 50)+1);
            vector.setY((int) (Math.random() * 50)+1);
            arrTwo[i] = vector;
            System.out.println(arrTwo[i].toString());
        }
        System.out.println();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
