package polymorphism.practice.exercise6;

public class Cat extends Feline {

    String breed;

    public Cat(String animalName, String animalType, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void eat(Food food) {
        this.foodEaten += food.quantity;
    }

    @Override
    public String toString() {
        return animalType + " (Name: " + animalName + ", Breed: " + breed + ", Weight: "
                + animalWeight + ", Living region: " + livingRegion + ", " + this.foodEaten + ")";
    }
}
