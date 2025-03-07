// Shape.java
abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calculateArea(); // Abstract method to calculate area
    public abstract double calculatePerimeter(); // Abstract method to calculate perimeter
}
