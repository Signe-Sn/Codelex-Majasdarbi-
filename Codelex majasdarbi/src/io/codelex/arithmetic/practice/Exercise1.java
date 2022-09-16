package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner exercise1 = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int num1 = exercise1.nextInt();
        System.out.println("Please enter number 2: ");
        int num2 = exercise1.nextInt();

        if (num1 == 15 || num2 == 15) {
            System.out.println("true");
        } else if (num1 + num2 == 15) {
            System.out.println("true");
        } else if (num1 - num2 == 15) {
            System.out.println("true");
        }
    }
}

