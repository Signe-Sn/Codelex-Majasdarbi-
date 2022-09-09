package io.codelex.typesandvariables.practice;

import java.util.Scanner;


public class Exercise7 {
    public static void main(String[] args) {
        String string;
        int upper = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        string = input.nextLine();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }
        System.out.println("Uppercase letters: " + upper);
    }
}
