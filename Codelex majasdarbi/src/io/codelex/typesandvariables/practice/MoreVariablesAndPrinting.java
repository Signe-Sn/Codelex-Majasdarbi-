package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String name = "Zed A. Shaw";
        int age = 35;
        double height = 74 * 2.54;  // centimeters
        double weight = 180 * 0.453592; // kilograms
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.printf("He's %.2f cm tall. ", height);
        System.out.printf("\nHe's %.2f kg heavy. ", weight);
        System.out.println("\nActually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + height + ", and " + weight
                + " I get " + (age + height + weight) + ".");
    }
}