package main.java.io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Set<String> names = new HashSet<>();

        while (true) {

            System.out.println("Enter name: ");
            String name = input.nextLine();

            if (!name.equals("")) {
                names.add(name);
            } else {
                System.out.println("Unique name list contains: " + names);
                break;
            }
        }
    }
}
