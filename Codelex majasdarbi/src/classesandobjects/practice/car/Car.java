package classesandobjects.practice.car;

public class Car {

    private double startKilometers;
    private int mileage;
    private double liters;

    public Car(double startOdo) {
        this.startKilometers = startOdo;
    }

    void fillUp(int mileage, double liters) {
        this.mileage = mileage;
        this.liters = liters;
    }

    public double calculateConsumption() {
        double distanceDriven = mileage - startKilometers;
        return (liters * 100) / distanceDriven;
    }

    public boolean isAGasHog() {
        if (calculateConsumption() > 15.0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEconomyCar() {
        if (calculateConsumption() < 5.0) {
            return true;
        } else {
            return false;
        }
    }
}

