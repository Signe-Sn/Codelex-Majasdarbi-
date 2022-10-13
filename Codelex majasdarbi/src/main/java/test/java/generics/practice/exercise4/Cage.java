package test.java.generics.practice.exercise4;

class Cage <T extends Food> {
    Animal<T> animal;

    Cage(Animal<T> animal) {
        this.animal = animal;
    }

    Animal<T> getAnimal() {
        return animal;
    }
}
