package Task10;

public enum Position {
    DIRECTOR(1.5), WORKER(1);

    private final double coefficient;

    Position(double coeff) {
        this.coefficient = coeff;
    }

    public double getCoeff() {
        return coefficient;
    }

}

