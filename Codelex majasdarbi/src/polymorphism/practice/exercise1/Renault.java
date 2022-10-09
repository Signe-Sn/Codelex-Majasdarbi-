package polymorphism.practice.exercise1;

public class Renault implements Car {
    protected int currentSpeed;

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 12;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Renault{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
