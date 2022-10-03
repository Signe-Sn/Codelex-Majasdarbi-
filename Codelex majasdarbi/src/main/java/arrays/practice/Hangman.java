package arrays.practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

    static String misses = "";
    static String randomWord;
    static ArrayList<Character> allGuesses = new ArrayList<>();
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        int wrongCount = 0;
        boolean gameStart = true;

        while (gameStart) {

            randomGenerator();
            guessedLetterList();

            while (true) {

                if (wrongCount >= 15) {
                    System.out.println("You lose!");
                    break;
                }
                if (!getPlayersGuess()) {
                    wrongCount++;
                }
                if (guessedLetterList()) {
                    System.out.println("YOU GOT IT!");
                    break;
                }
                System.out.println("Misses: " + misses);
            }

            System.out.println("Play \"again\" or \"quit\"? quit");
            String starGame = input.nextLine();
            if (starGame.equals("quit")) {
                gameStart = false;
            } else {
                allGuesses.clear();
            }
        }
    }


    private static boolean getPlayersGuess() {
        System.out.print("Guess: ");
        String guessLetter = input.nextLine();
        allGuesses.add(guessLetter.charAt(0));

        if (!randomWord.contains(guessLetter)) {
            misses += guessLetter;
        }

        return randomWord.contains(guessLetter);
    }

    public static String randomGenerator() {
        String[] words = {"leviathan", "rainbow", "mushroom", "apocalypse", "catastrophe", "dictatorship"};
        Random random = new Random();
        int randomNumber = random.nextInt(words.length);
        randomWord = words[randomNumber];
        return randomWord;
    }

    private static boolean guessedLetterList() {
        int correctGuessCount = 0;
        for (int i = 0; i < randomWord.length(); i++) {
            if (allGuesses.contains(randomWord.charAt(i))) {
                System.out.print(randomWord.charAt(i));
                correctGuessCount++;
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
        return (randomWord.length() == correctGuessCount);
    }
}