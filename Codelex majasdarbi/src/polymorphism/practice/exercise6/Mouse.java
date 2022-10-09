package polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak!");
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getName().contains("Meat")) {
            System.out.println("Mouse does not eat this type of food!");
        } else {
            this.foodEaten += food.quantity;
        }
    }

    @Override
    public String toString() {
        return animalType + " (Name: " + animalName + ", Weight: "
                + animalWeight + ", Living region: " + livingRegion + ", " + this.foodEaten + ")";
    }
}
