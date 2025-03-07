// MainProgram.java
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Select a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Equilateral Pyramid");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            Shape shape = null;
            Volume volume = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = scanner.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3:
                    System.out.print("Enter side of the square: ");
                    double side = scanner.nextDouble();
                    shape = new Square(side);
                    break;
                case 4:
                    System.out.print("Enter radius of the sphere: ");
                    double sphereRadius = scanner.nextDouble();
                    shape = new Sphere(sphereRadius);
                    volume = (Volume) shape; // Cast to Volume to calculate volume
                    break;
                case 5:
                    System.out.print("Enter radius of the cylinder: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("Enter height of the cylinder: ");
                    double height = scanner.nextDouble();
                    shape = new Cylinder(cylinderRadius, height);
                    volume = (Volume) shape; // Cast to Volume to calculate volume
                    break;
                case 6:
                    System.out.print("Enter base side of the pyramid: ");
                    double baseSide = scanner.nextDouble();
                    System.out.print("Enter height of the pyramid: ");
                    double pyramidHeight = scanner.nextDouble();
                    shape = new EquilateralPyramid(baseSide, pyramidHeight);
                    volume = (Volume) shape; // Cast to Volume to calculate volume
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            if (shape != null) {
                System.out.println("Shape: " + shape.shapeName);
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
            }

            if (volume != null) {
                System.out.println("Volume: " + volume.calculateVolume());
            }
        }

        scanner.close();
    }
}
