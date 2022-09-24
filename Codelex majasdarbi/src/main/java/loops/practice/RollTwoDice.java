package loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    static Random TWO_DICE = new Random();
    public static void main(String[] args) {

        int sum = 0;
        int wantedNum;

        Scanner input = new Scanner(System.in);
        System.out.print("Input desired sum between 2 and 12: ");
        wantedNum = input.nextInt();
        System.out.println("Desired sum is " + wantedNum);

        do {
            int diceRoll = rollDice(1,6);
            int diceRoll2 = rollDice(1,6);
            sum = diceRoll + diceRoll2;
            System.out.println(diceRoll + " and " + diceRoll2 + " = " + sum);
        } while (sum != wantedNum);
    }

    public static int rollDice (int min, int max) {
        return TWO_DICE.nextInt((max - min) + 1) + 1;
    }
}
