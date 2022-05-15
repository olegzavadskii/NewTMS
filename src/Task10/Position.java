package Task10;

public enum Position {
    DIRECTOR(1.5),
    WORKER(1);

    private final double coefficient;

    Position(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getCoefficient() {
        return coefficient;
    }

}

