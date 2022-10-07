package main.java.io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        while (number != 1 && number != 4) {
            number = checkNumber(number);
        }

        if (number == 1) {
            System.out.println("Is a happy number");
        } else {
            System.out.println("Is not a happy number");
        }
    }

    public static int checkNumber(int num) {
        int sum = 0;
        int remainder;

        while (num > 0) {
            remainder = num % 10;
            sum += remainder * remainder;
            num = num / 10;
        }
        return sum;
    }
}
