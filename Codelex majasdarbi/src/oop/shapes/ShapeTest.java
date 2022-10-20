package oop.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 5, 4);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        Rectangle rectangle = new Rectangle(4,6,6);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
