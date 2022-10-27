package classesandobjects.practice.fuelgauge;

public class OdometerFuelTestClass {
    public static void main(String[] args) {
        FuelGauge fuel = new FuelGauge(5);
        Odometer odometer = new Odometer(70);

        fuel.puttingFuelInCar();

        while (fuel.getLiters() > 0){
            odometer.increasingMileage(fuel);
            System.out.println("Cars current mileage is " + odometer.getMileage() +
                                " and the current amount of liters ir: " + fuel.getLiters());
        }
    }
}
