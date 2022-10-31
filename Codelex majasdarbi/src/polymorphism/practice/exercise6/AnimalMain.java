package polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalMain {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Mammal> animalList = new ArrayList<>();

        while (true) {

            System.out.println("Enter type of animal (Cat, Tiger, Zebra or Mouse), or End to quit");
            String animal = input.next();

            switch (animal) {
                case "Cat", "Tiger", "Zebra", "Mouse" -> {
                    Mammal creature = createAnimal(animal);
                    assert creature != null;
                    creature.makeSound();
                    feedTheAnimal(creature);
                    animalList.add(creature);
                    System.out.println(creature);
                }
                case "End" -> {
                    System.out.println(animalList);
                    System.exit(0);
                }
                default -> System.out.println("Invalid animal type.");
            }
        }
    }

    public static void feedTheAnimal(Animal animal) {
        System.out.println("Feed the animal (Meat or Vegetables) and enter quantity: ");
        String food = input.next();
        int quantity = input.nextInt();
        if (food.equals("Meat")) {
            animal.eat(new Meat(quantity));
        } else {
            animal.eat(new Vegetable(quantity));
        }
    }

    public static Mammal createAnimal(String animal) {
        System.out.println("Enter name: ");
        String name = input.next();
        System.out.println("Enter weight: ");
        double weight = input.nextDouble();
        System.out.println("Enter living region: ");
        String livingRegion = input.next();

        switch (animal) {
            case "Cat":
                System.out.println("Enter breed");
                String breed = input.next();
                return new Cat(name, animal, weight, livingRegion, breed);
            case "Tiger":
                return new Tiger(name, animal, weight, livingRegion);
            case "Zebra":
                return new Zebra(name, animal, weight, livingRegion);
            case "Mouse":
                return new Mouse(name, animal, weight, livingRegion);
        }
        return null;
    }
}
