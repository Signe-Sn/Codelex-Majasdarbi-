package main.java.io.codelex.enums.practice.rockpaperscissors;

public enum RockPaperScissors {

    ROCK("R"),
    PAPER("P"),
    SCISSORS("S");

    final String value;

    RockPaperScissors(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
