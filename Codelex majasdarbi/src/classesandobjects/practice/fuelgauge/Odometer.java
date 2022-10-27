package classesandobjects.practice.fuelgauge;

public class Odometer {
    private double mileage;
    private final double startingMileage;

    public Odometer(double mileage) {
        this.startingMileage = mileage;
        this.mileage = mileage;
    }

    public double getMileage() {
        return mileage;
    }

    public void increasingMileage(FuelGauge fuelGauge) {
        mileage++;
        if (mileage == 999999) {
            mileage = 0;
        }
        double distanceDriven = startingMileage - mileage;
        int kilometersPerLiter = 10;
        if (distanceDriven % kilometersPerLiter == 0) {
            fuelGauge.burningFuel();
        }
    }
}
