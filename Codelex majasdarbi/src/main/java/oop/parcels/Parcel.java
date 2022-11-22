package oop.parcels;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {

        int maxSize = 300;
        int minSize = 30;
        int maxWeightExpress = 15;
        int maxWeightNonExpress = 30;

        if (xLength + yLength + zLength > maxSize) {
            System.out.println("Error, exceeded total maximum size!");
            return false;
        }

        if (xLength < minSize || yLength < minSize || zLength < minSize) {
            System.out.println("Error, under allowed minimum size!");
            return false;
        }

        if (isExpress) {
            if (weight > maxWeightExpress) {
                System.out.println("Error, exceeded maximum weight for express delivery!");
                return false;
            }
        }

        if (!isExpress) {
            if (weight > maxWeightNonExpress) {
                System.out.println("Error, exceeded maximum weight for non-express delivery!");
                return false;
            }
        }

        return true;
    }
}
