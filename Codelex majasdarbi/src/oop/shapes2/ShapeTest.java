package oop.shapes2;

public class ShapeTest {
    public static void main(String[] args) {

        System.out.println("Cone calculations:");
        Cone cone = new Cone(4, 7);
        System.out.println("volume: " + cone.calculateVolume());
        System.out.println("area: " + cone.calculateArea());
        System.out.println("perimeter: " + cone.calculatePerimeter());
        System.out.println();


        System.out.println("Cube calculations:");
        Cube cube = new Cube(5);
        System.out.println("volume: " + cube.calculateVolume());
        System.out.println("area: " + cube.calculateArea());
        System.out.println("perimeter: " + cube.calculatePerimeter());
        System.out.println();


        System.out.println("Hexagon calculations:");
        Hexagon hexagon = new Hexagon(9);
        System.out.println("area: " + hexagon.calculateArea());
        System.out.println("perimeter: " + hexagon.calculatePerimeter());
        System.out.println();


        System.out.println("Rectangle calculations:");
        Rectangle rectangle = new Rectangle(4,6);
        System.out.println("area: " + rectangle.calculateArea());
        System.out.println("perimeter: " + rectangle.calculatePerimeter());
        System.out.println();


        System.out.println("Triangle calculations: ");
        Triangle triangle = new Triangle(7, 3);
        System.out.println("perimeter: " + triangle.calculatePerimeter());
        System.out.println("area: " + triangle.calculateArea());
    }
}
