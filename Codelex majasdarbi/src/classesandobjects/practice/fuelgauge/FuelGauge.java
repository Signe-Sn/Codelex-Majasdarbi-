package classesandobjects.practice.fuelgauge;

public class FuelGauge {
    static double liters;

    public FuelGauge(double liters) {
        FuelGauge.liters = liters;
    }

    public static double getLiters() {
        return liters;
    }

    public static void puttingFuelInCar() {
        if (liters < 70) {
            liters++;
        } else {
            System.out.println("Fuel reached maximum capacity.");
        }
    }

    public static void burningFuel() {
        if (liters > 0) {
            liters--;
        } else {
            System.out.println("Out of fuel.");
        }
    }
}
