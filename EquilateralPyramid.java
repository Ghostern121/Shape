// EquilateralPyramid.java
public class EquilateralPyramid extends Shape implements Volume {
    private double baseSide;
    private double height;

    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(baseSide / 2, 2));
        return Math.pow(baseSide, 2) + 4 * (0.5 * baseSide * slantHeight);
    }

    @Override
    public double calculatePerimeter() {
        return 4 * baseSide; // Perimeter of the square base
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.pow(baseSide, 2) * height;
    }
}
