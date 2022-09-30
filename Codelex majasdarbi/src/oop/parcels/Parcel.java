package oop.parcels;

public class Parcel implements Validatable {

    int xLength;
    int yLength;
    int zLength;
    float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {

        if (xLength + yLength + zLength > 300) {
            System.out.println("Error, exceeded total maximum size!");
            return false;
        }

        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Error, under allowed minimum size!");
            return false;
        }

        if (isExpress) {
            if (weight > 15) {
                System.out.println("Error, exceeded maximum weight for express delivery!");
                return false;
            }
        }

        if (!isExpress) {
            if (weight > 30) {
                System.out.println("Error, exceeded maximum weight for non-express delivery!");
                return false;
            }
        }

        return true;
    }
}
