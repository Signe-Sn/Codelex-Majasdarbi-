package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {

        int num;

        Scanner exercise2 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        num = exercise2.nextInt();

        if (num % 2 == 0){
            System.out.println("Even Number");
            System.out.println("Bye!");
        } else {
            System.out.println("Odd Number");
            System.out.println("Bye!");
        }
    }
}
