package main.java.io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            int numerator = 0;
            try {
                System.out.println("Enter the numerator");
                numerator = scanner.nextInt();
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);

            } catch (ArithmeticException e) {
                System.out.println("Can't divide " + numerator + " by zero.");
            } catch (InputMismatchException e) {
                String input = scanner.nextLine();
                if (input.contains("q") || input.contains("Q")) {
                    break;
                }
                System.out.println("You entered bad data \nPlease try again");
            }
        }
    }
}