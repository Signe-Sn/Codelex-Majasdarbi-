package oop.shapes2;

public class Triangle extends Shape {

    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        double bSide = 2 * (calculateArea() / height);
        double cSide = Math.sqrt(height * height + (2 * calculateArea() / height) * (2 * calculateArea() / height));
        return bSide + cSide + height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base * height);
    }
}
