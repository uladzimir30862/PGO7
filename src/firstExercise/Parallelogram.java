package firstExercise;

public class Parallelogram implements Figure{
    private final double baseSide;
    private final double side;
    public final double height;
    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.height = height;
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 2 * (baseSide + side);
    }

    @Override
    public double getArea() {
        return baseSide * height;
    }

    @Override
    public String getType() {
        return "Paralelogramm";
    }
}
