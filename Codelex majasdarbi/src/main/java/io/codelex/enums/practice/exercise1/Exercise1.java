package main.java.io.codelex.enums.practice.exercise1;

public enum Exercise1 {
    NORTH("Up"),
    SOUTH("Down"),
    EAST("Right"),
    WEST("Left");

    final String direction;

    Exercise1(String direction) {
        this.direction = direction;
    }
}
