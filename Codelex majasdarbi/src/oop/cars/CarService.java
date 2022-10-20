package oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CarService {

    ArrayList<Car> listOfCars = new ArrayList<>();

    public void addCarToList(Car car) {
        listOfCars.add(car);
    }

    public void removeCarFromList(Car car) {
        listOfCars.remove(car);
    }

    public List<Car> getCarsWithV12Engine() {
        return listOfCars.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .toList();
    }

    public List<Car> getCarsMadeBefore1999() {
        return listOfCars.stream()
                .filter(car -> car.getYearOfManufacture() <= 1999)
                .toList();
    }

    public Car getMostExpensiveCar() {
        int highestPrice = 0;
        Car mostExpensiveCar = null;

        for (Car car : listOfCars) {
            if (car.getPrice() > highestPrice) {
                highestPrice = car.getPrice();
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;
    }

    public Car getCheapestCar() {
        Car cheapestCar = listOfCars.get(0);
        int cheapestPrice = listOfCars.get(0).getPrice();

        for (Car car : listOfCars) {
            if (car.getPrice() < cheapestPrice) {
                cheapestPrice = car.getPrice();
                cheapestCar = car;
            }
        }
        return cheapestCar;

    }

    public List<Car> getCarWithMostManufacturers() {
        return listOfCars.stream()
                .filter(car -> car.manufacturerList.size() >= 3)
                .toList();
    }

    public List<Car> sortByPrice(String parameter) {
        if (parameter.equals("ascending")) {
            listOfCars.sort(Comparator.comparing(Car::getPrice));
        } else {
            listOfCars.sort(Comparator.comparing(Car::getPrice).reversed());
        }
        return listOfCars;
    }

    public boolean checkIfCarIsInTheList(String name) {
        for (Car car : listOfCars) {
            if (car.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public Car printCarWithManufacturer(Manufacturer manufacturer) {
        for (Car car : listOfCars) {
            if (car.getManufacturerList().contains(manufacturer)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getCarByManuEstablishment(String operator, int year) {
        if (operator.equals("<")) {
            return listOfCars.stream().filter(car -> car.getManufacturerList().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() < year)).toList();
        } else if (operator.equals(">")) {
            return listOfCars.stream().filter(car -> car.getManufacturerList().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() > year)).toList();
        } else if (operator.equals("<=")) {
            return listOfCars.stream().filter(car -> car.getManufacturerList().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() <= year)).toList();
        } else if (operator.equals(">=")) {
            return listOfCars.stream().filter(car -> car.getManufacturerList().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() >= year)).toList();
        } else if (operator.equals("==")) {
            return listOfCars.stream().filter(car -> car.getManufacturerList().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() == year)).toList();
        } else if (operator.equals("!=")) {
            return listOfCars.stream().filter(car -> car.getManufacturerList().stream().anyMatch(manufacturer -> manufacturer.getYearOfEstablishment() != year)).toList();
        }
        return null;
    }


    public ArrayList<Car> getListOfCars() {
        return listOfCars;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "listOfCars=" + listOfCars +
                '}';
    }
}
