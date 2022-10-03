package oop.shapes2;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class Cone extends Shape3D{

    int radius;
    int height;

    public Cone(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
       return 2 * PI * radius;
       //base perimeter, savādāka nebūs šoreiz
    }

    @Override
    public double calculateArea() {
        double lateralSurfaceArea = PI * radius * sqrt((radius*radius) + (height*height));
        double baseSurfaceArea = PI * (radius * radius);
        return lateralSurfaceArea + baseSurfaceArea;
        //total surface area
    }

    @Override
    public double calculateVolume() {
        return (1 / 3d) * PI * (radius * radius) * height;
    }
}
