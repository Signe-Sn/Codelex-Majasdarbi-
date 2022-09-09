package io.codelex.typesandvariables.practice;

public class Exercise8 {

    static void calculation(int minutes) {
        int years = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        int days = remainingMinutes / 1440;
        System.out.println(minutes + " minutes is " + years + " years and " + days + " days.");
    }

    public static void main(String[] args) {
        calculation(3470348);
    }
}