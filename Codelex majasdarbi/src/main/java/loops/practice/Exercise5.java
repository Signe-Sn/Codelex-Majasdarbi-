package loops.practice;

import java.util.Scanner;

public class Exercise5 {

    private static final int LINES = 30;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String firstWord = input.next();
        System.out.print("Enter the second word: ");
        String secondWord = input.next();

        String together = firstWord + secondWord;
        int count = together.length();

        String dots = "";
        int characters = 0;

        if (count <= LINES) {
            characters = LINES - count;
            for (int i = 1; i <= characters; i++) {
                dots += ".";
            }
            System.out.println(firstWord + dots + secondWord);
        }

    }
}
