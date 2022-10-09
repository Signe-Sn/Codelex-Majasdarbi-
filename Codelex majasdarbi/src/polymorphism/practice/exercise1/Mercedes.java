package polymorphism.practice.exercise1;

public class Mercedes implements Car, Boost {

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
        currentSpeed += 15;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 15;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 25;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
