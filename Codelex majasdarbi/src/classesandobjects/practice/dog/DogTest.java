package classesandobjects.practice.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog max = new Dog("Max", "male", "Lady", "Rocky");
        Dog rocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female", "Molly", "Buster");

        String fathersName = sparky.fathersName();
        String fathersName2 = coco.fathersName();
        System.out.println(fathersName);
        System.out.println(fathersName2);
        boolean sameMother = coco.hasSameMotherAs(rocky);
        System.out.println(sameMother);
    }
}
