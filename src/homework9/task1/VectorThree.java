package homework9.task1;

public class VectorThree implements Inter {
    private int x;
    private int y;
    private int z;
    public static final String INFO = "Это вектор для трехмерной системы координат";

    public VectorThree() {
    }

    public VectorThree(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //метод вычисления длины
    @Override
    public void length() {
        int lengthThree = (int) Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        System.out.println("Длина вектора составляет " + lengthThree);
    }

    //метод сравнения векторов
    public void compare(VectorThree vector2) {
        int lengthThree1 = (int) Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        int lengthThree2 = (int) Math.sqrt(vector2.x * vector2.x + vector2.y * vector2.y + vector2.z * vector2.z);
        if (lengthThree1 == lengthThree2) {
            System.out.println("Вектор 1 равен вектору 2");
        } else if (lengthThree1 > lengthThree2) {
            System.out.println("Вектор 1 больше вектора 2");
        } else if (lengthThree1 < lengthThree2) {
            System.out.println("Вектор 1 меньше вектора 2");
        }
    }

    //метод вычисления скалярного произведения
    public void scalarThree(VectorThree vector2) {
        int scalThree = this.x * vector2.x + this.y * vector2.y + this.z * vector2.z;
        System.out.println("Скалярное произведение двух векторов составляет " + scalThree);
    }

    //метод сложения векторов
    public void plusVectorThree(VectorThree vector2) {
        int sumX = this.x + vector2.x;
        int sumY = this.y + vector2.y;
        int sumZ = this.z + vector2.z;
        System.out.printf("Сумма векторов равна (%d; %d; %d)\n", sumX, sumY, sumZ);
    }

    //метод разности векторов
    public void minusVectorThree(VectorThree vector2) {
        int diffX = this.x - vector2.x;
        int diffY = this.y - vector2.y;
        int diffZ = this.z - vector2.z;
        System.out.printf("Разность векторов равна (%d; %d; %d)\n", diffX, diffY, diffZ);
    }

    //метод для вывода информации о векторе
    @Override
    public String toString() {
        return "VectorThree {" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                "}. " + INFO;
    }

    //создание массива с векторами
    public static void createArrayThree(int N) {
        VectorThree[] arrThree = new VectorThree[N];
        for (int i = 0; i < N; i++) {
            VectorThree vector = new VectorThree();
            vector.setX((int) (Math.random() * 50) + 1);
            vector.setY((int) (Math.random() * 50) + 1);
            vector.setZ((int) (Math.random() * 50) + 1);
            arrThree[i] = vector;
            System.out.println(arrThree[i].toString());
        }
        System.out.println();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
