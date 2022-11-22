package oop.cars;

import java.util.ArrayList;
import java.util.Objects;


public class Car {
    private String name;
    private String model;
    private int price;
    private int yearOfManufacture;

    private final EngineType engineType;

    private ArrayList<Manufacturer> manufacturerList = new ArrayList<>();

    public Car(String name, String model, int price, int yearOfManufacture, Manufacturer manufacturer, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engineType = engineType;
        manufacturerList.add(manufacturer);
    }

    public void addManufacturer(Manufacturer manufacturer) {
        manufacturerList.add(manufacturer);
    }

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }


    @Override
    public String toString() {
        return "Car: " + name + ", model: " + model + ", price: " + price + ", year of manufacture: " + yearOfManufacture + "; " + getManufacturerList();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManufacture == car.yearOfManufacture
                && Objects.equals(name, car.name)
                && Objects.equals(model, car.model)
                && Objects.equals(manufacturerList, car.manufacturerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacture, manufacturerList);
    }
}
