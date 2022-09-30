package oop.cars;

public class CarTest {


    public static void main(String[] args) {

        CarService service = new CarService();

        Manufacturer BMW = new Manufacturer("BMW", 1916, "Germany");
        Manufacturer MERCEDES = new Manufacturer("Mercedes", 1926, "Germany");
        Manufacturer WROOMWROOM = new Manufacturer("WROOMWROOM", 2020, "Antarctica");
        Manufacturer LEGOCARS = new Manufacturer("Lego", 1799, "Sweden");
        Manufacturer BRAUCAM = new Manufacturer("BraucamLV", 1989, "Latvia");


        Car balta = new Car("Balta", "ArStripinam", 33000, 2017, BMW, EngineType.V8);
        Car melna = new Car("Melna", "Nesmuka", 15999, 1998, MERCEDES, EngineType.V6);
        Car sarkana = new Car("Sarkana", "Smuka", 19000, 2018, LEGOCARS, EngineType.V12);
        Car zila = new Car("Zila", "irOK", 20000, 2015, WROOMWROOM, EngineType.S4);

        service.addCarToList(balta);
        service.addCarToList(melna);
        service.addCarToList(sarkana);
        service.addCarToList(zila);

        balta.addManufacturer(MERCEDES);
        balta.addManufacturer(BRAUCAM);

        System.out.println("Cheapest car: " + service.getCheapestCar());
        System.out.println("Most expensive car: " + service.getMostExpensiveCar());
        System.out.println("Car with most manufacturers: " + service.getCarWithMostManufacturers());
        System.out.println("Cars with V12 engines: " + service.getCarsWithV12Engine());
        System.out.println("Cars made before 1999: " + service.getCarsMadeBefore1999());
        System.out.println("List of all cars: " + service.getListOfCars());
        System.out.println("List of cars with a specific manufacturer: " + service.printCarWithManufacturer(WROOMWROOM));
        System.out.println("Sort cars by price: " + service.sortByPrice("descending"));
        System.out.println("Check if car is in the list by name: " + service.checkIfCarIsInTheList("Zala"));
        System.out.println("Find all cars by manufacturer establishment date: " + service.getCarByManuEstablishment("<", 1920));
    }
}
