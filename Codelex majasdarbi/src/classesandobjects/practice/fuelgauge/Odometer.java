package classesandobjects.practice.fuelgauge;

public class Odometer {
    private double mileage;
    private double startingMileage;
    final int kilometersPerLiter = 10;

    public Odometer(double mileage) {
        this.startingMileage = mileage;
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void increasingMileage() {
        mileage++;
        if (mileage == 999999) {
            mileage = 0;
        }
        double distanceDriven = startingMileage - mileage;
        if (distanceDriven % kilometersPerLiter == 0) {
            FuelGauge.burningFuel();
        }
    }

}
