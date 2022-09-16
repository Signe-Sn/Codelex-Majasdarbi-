package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {

        Scanner exercise2 = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = exercise2.nextInt();

        if (num % 2 == 0){
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
        System.out.println("Bye!");
    }
}
