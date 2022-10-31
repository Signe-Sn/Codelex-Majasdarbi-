package polymorphism.practice.exercise6;

public abstract class Animal {
    String animalName;
    String animalType;
    double animalWeight;
    int foodEaten;

    public Animal(String animalName, String animalType, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public abstract void makeSound();

    public abstract void eat(Food food);

}
