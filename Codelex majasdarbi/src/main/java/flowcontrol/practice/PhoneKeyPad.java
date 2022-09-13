package flowcontrol.practice;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter text: ");

        String text = input.next().toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

            switch (letter) {
                case 'a', 'b', 'c' -> System.out.print(2);
                case 'd', 'e', 'f' -> System.out.print(3);
                case 'g', 'h', 'i' -> System.out.print(4);
                case 'j', 'k', 'l' -> System.out.print(5);
                case 'm', 'n', 'o' -> System.out.print(6);
                case 'p', 'q', 'r', 's' -> System.out.print(7);
                case 't', 'u', 'v' -> System.out.print(8);
                case 'w', 'x', 'y', 'z' -> System.out.print(9);
            }
        }

        /*
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);

        if (letter >= 'a' && letter <= 'c') {
            System.out.print(2);
        } else if (letter >= 'd' && letter <= 'f') {
            System.out.print(3);
        } else if (letter >= 'g' && letter <= 'i') {
            System.out.print(4);
        } else if (letter >= 'j' && letter <= 'l') {
            System.out.print(5);
        } else if (letter >= 'm' && letter <= 'o') {
            System.out.print(6);
        }else if (letter >= 'p' && letter <= 's') {
            System.out.print(7);
        } else if (letter >= 't' && letter <= 'v') {
            System.out.print(8);
        }else if (letter >= 'w' && letter <= 'z') {
            System.out.print(9);
        }
        }
        */
    }
}