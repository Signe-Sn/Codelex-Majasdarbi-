package polymorphism.practice.exercise2;

import java.sql.SQLOutput;

public class Radio implements Sound{
    @Override
    public void playSound() {
        System.out.println("Starts playing music");
    }
}
