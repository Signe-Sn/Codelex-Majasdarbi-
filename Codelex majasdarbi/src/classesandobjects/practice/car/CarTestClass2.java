package classesandobjects.practice.car;

public class CarTestClass2 {
    public static void main(String[] args) {

        Car testCar = new Car(400);

        testCar.fillUp(470, 20);

        System.out.println(testCar.calculateConsumption());

        if (testCar.isEconomyCar()) {
            System.out.println("This car is very economic!");
        } else if (testCar.isAGasHog()) {
            System.out.println("This car is a gas hog!");
        }
    }
}
