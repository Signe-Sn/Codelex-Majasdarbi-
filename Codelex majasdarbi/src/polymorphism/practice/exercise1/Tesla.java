package polymorphism.practice.exercise1;

public class Tesla implements Car {
    protected int currentSpeed;

    public void startEngine() {
        System.out.println("-- silence ---");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 20;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 20;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
