package oop.shapes2;

public class Cube extends Shape3D {

    double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return sideLength * 12;
    }

    @Override
    public double calculateArea() {
        return (sideLength * sideLength) * 6;
    }

    @Override
    public double calculateVolume() {
        return sideLength * sideLength * sideLength;
    }
}
