package loops.practice;

import java.util.Scanner;
import java.util.Random;

public class Piglet {
    public static void main(String[] args) {
        Random pigGame = new Random();
        int min = 1;
        int max = 6;
        int points = 0;
        String userChoice;

        do {
            int diceRoll = pigGame.nextInt((max - min) + 1) + 1;
            Scanner pig = new Scanner(System.in);
            System.out.println("You rolled a " + diceRoll + "!");
            points = diceRoll + points;
            if (diceRoll != 1) {
                System.out.print("Roll again? ");
            }
            if (diceRoll == 1) {
                System.out.println("You got 0 points!");
                System.exit(0);
                pig.close();

            }
            userChoice = pig.next();

            if (userChoice.equals("no")) {
                System.out.println("You got " + points + " points!");
                pig.close();
            }

        } while (userChoice.equals("yes"));
    }
}
