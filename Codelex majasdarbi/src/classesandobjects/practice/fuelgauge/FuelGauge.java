package classesandobjects.practice.fuelgauge;

public class FuelGauge {
    private static double liters;


    public FuelGauge(double liters) {
        FuelGauge.liters = liters;
    }

    public static double getLiters() {
        return liters;
    }

    public static void puttingFuelInCar() {
        int maxLiterCapacity = 70;
        if (liters < maxLiterCapacity) {
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
