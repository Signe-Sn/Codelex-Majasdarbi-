package main.java.io.codelex.enums.practice.exercise1;

public class Exercise1Main {

    public static void main(String[] args) {

        for (Exercise1 value : Exercise1.values()){
            System.out.print(value + ": " + value.direction + ": " + value.ordinal() + "\n");
        }
    }

}
