package polymorphism.practice.exercise1;

public class Lexus implements Car, Boost{
    private int currentSpeed;

    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 8;
    }

    @Override
    public int showCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    @Override
    public String toString() {
        return "Lexus{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
