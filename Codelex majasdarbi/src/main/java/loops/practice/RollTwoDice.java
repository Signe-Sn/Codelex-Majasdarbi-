package loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Random twoDice = new Random();
        int min = 1;
        int max = 6;
        int sum = 0;
        int wantedNum;

        Scanner input = new Scanner(System.in);
        System.out.print("Input desired sum between 2 and 12: ");
        wantedNum = input.nextInt();
        System.out.println("Desired sum is " + wantedNum);

        do {
            int diceRoll = twoDice.nextInt((max - min) + 1) + 1;
            int diceRoll2 = twoDice.nextInt((max - min) + 1) + 1;
            sum = diceRoll + diceRoll2;
            System.out.println(diceRoll + " and " + diceRoll2 + " = " + sum);
        } while (sum != wantedNum);
    }
}
