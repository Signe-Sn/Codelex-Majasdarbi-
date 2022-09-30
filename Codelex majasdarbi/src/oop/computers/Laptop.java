package oop.computers;

import java.util.Objects;

public class Laptop extends Computer {

    int battery;

    public Laptop(double processor, int ram, String graphicsCard, String company, String model, int battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop(2.5, 8, "Mazina", "Lenovo", "Basic", 5);
        Computer computer = new Computer(4.5, 24, "AMD", "PcSpecialist", "Datorins");

        System.out.println(laptop.getModel());

        System.out.println(laptop.getCompany());

        System.out.println(laptop.getRam());

        laptop.setBattery(6);

        System.out.println(laptop.getBattery());

        System.out.println(computer.getGraphicsCard());

        System.out.println(laptop);

        System.out.println(computer);

    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Laptop - " + "processor: " + processor +
                ", ram: " + ram + "GB" +
                ", graphicsCard: " + graphicsCard +
                ", company: " + company +
                ", model: " + model + ", battery life: " + battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        if (!super.equals(o)) return false;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
