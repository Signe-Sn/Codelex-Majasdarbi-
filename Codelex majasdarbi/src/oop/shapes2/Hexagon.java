package oop.shapes2;

public class Hexagon extends Shape{

    int side;

    public Hexagon(int side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * side;
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(3)) * (side * side)) / 2;
    }
}
