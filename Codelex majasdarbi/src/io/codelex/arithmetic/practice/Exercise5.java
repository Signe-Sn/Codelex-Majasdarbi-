package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int selection;
        int randomNum = (int)Math.floor(Math.random() * (max - min + 1) + min);

        Scanner inputRandom = new Scanner(System.in);
        System.out.println("Please enter your number from 1 to 100: ");
        selection = inputRandom.nextInt();

        if (selection == randomNum) {
            System.out.println("You guessed it! What are the odds??");
        } else if (selection > randomNum) {
            System.out.println("Sorry, you are too high. I was thinking of " + randomNum + ".");
        } else if (selection < randomNum) {
            System.out.println("Sorry, you are too low. I was thinking of " + randomNum + ".");
        }

    }

}

