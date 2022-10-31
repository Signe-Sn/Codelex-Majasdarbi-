package polymorphism.practice.exercise6;

public abstract class Mammal extends Animal{
    String livingRegion;

    public Mammal(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return "Mammal (" + "Type: " + animalType
                + ", Name: " + animalName + ", Weight: "
                +  animalWeight + ", Living region: " + livingRegion + ")";
    }
}
