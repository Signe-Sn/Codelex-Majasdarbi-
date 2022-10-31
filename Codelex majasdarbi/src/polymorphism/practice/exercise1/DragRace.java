package polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {

        List<Car> listOfCars = new ArrayList<>();

        Mercedes mercedes = new Mercedes();
        Bmw bmw = new Bmw();
        Lexus lexus = new Lexus();
        Renault renault = new Renault();
        Audi audi = new Audi();
        Tesla tesla = new Tesla();

        listOfCars.add(mercedes);
        listOfCars.add(bmw);
        listOfCars.add(renault);
        listOfCars.add(audi);
        listOfCars.add(lexus);
        listOfCars.add(tesla);

        int highestSpeed = 0;
        Car fastestCar = null;

        for (int i = 0; i < 10; i++) {
            for (Car car : listOfCars) {
                car.speedUp();
                if (i == 2) {
                    if (car instanceof Boost) {
                        ((Boost) car).useNitrousOxideEngine();
                    }
                }
                if (car.showCurrentSpeed() >= highestSpeed){
                    highestSpeed = car.showCurrentSpeed();
                    fastestCar = car;
                }
            }
        }
        System.out.println(fastestCar);
    }
}
