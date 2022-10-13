package test.java.generics.practice.exercise4;

class Zoo {
    static void feedAnimal(Cage<Sheep> cage) {
        feed(cage.getAnimal().lunchBag, cage.getAnimal());
    }

    static <F extends Food> void feed(F food, Animal<F> animal) {
        animal.eat(food);
    }

    void manage() {
        Wolf wolf = new Wolf();
        Sheep sheep = new Sheep();
        //feedAnimal(sheep.eat(wolf));
    }
}
