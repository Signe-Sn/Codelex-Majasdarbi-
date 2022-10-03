package oop.shapes;

public class Triangle extends Shape {

    private int width;
    private int height;

    public Triangle(int numSides, int width, int height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (width * height) / 2d;
    }

    @Override
    public double getPerimeter() {
        double bSide = 2 * (getArea() / height);
        double cSide = Math.sqrt(height * height + (2 * getArea() / height) * (2 * getArea() / height));
        return bSide + cSide + height;
    }
}
