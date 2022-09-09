package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner enterDigit = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter multiple single digit numbers please: ");

        int userInput1 = enterDigit.nextInt(); // User input
        int userInput2 = enterDigit.nextInt();
        int userInput3 = enterDigit.nextInt();

        System.out.println("Entered numbers are: " + userInput1 + "," + userInput2 + "," + userInput3);

        int sum = userInput1 + userInput2 + userInput3;
        System.out.println("The sum of all numbers is: " + sum);


    }
}
