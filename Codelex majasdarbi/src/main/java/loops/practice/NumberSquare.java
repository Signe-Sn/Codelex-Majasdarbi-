package loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a min number: ");
        int min = input.nextInt();
        System.out.print("Please enter a max number: ");
        int max = input.nextInt();


        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

