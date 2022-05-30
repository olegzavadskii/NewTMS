package homework9.classwork1;

public abstract class Flower {
    protected String country;
    protected int days;
    protected int cost;
    public static int sum;
    public static int count;

    public Flower(String country, int days, int cost) {
        this.country = country;
        this.days = days;
        this.cost = cost;
    }
}
