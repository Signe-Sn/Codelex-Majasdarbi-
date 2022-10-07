package main.java.io.codelex.enums.practice.rockpaperscissors;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class RPSMain {

    public static void main(String[] args) {

        double wins = 0;
        double computerWins = 0;
        int numOfGames = 0;

        Scanner input = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("##.00");
        DecimalFormat format1 = new DecimalFormat("##");

        System.out.println("Let us begin...");

        while (true) {

            System.out.println("Rock-Paper-Scissors");
            System.out.println("Your turn (enter R for rock, P for paper, S for scissors, or Q to quit): ");
            String playerMove = input.next();

            if (playerMove.equals("Q")) {
                double pcPercentage = (computerWins / numOfGames) * 100;
                double playerPercentage = (wins / numOfGames) * 100;
                System.out.println("\nNumber of trials: " + numOfGames + "\n" + "I won "
                                  + format1.format(computerWins) + "(" + format.format(pcPercentage) + "%)." + " You won "
                                  + format1.format(wins) + "(" + format.format(playerPercentage) + "%)." + "\n" + "Bye!");
                break;
            }

            if (!playerMove.equals("R") && !playerMove.equals("P") && !playerMove.equals("S")) {
                System.out.println("Invalid input, try again...");
                continue;
            }

            String computer = computerMove();
            System.out.println("My turn: " + computer);

            if (playerMove.equals(computer)) {
                System.out.println("Tie! \n");
            } else if (playerWins(playerMove, computer)) {
                System.out.println("You win! \n");
                wins++;
            } else {
                pcWins(playerMove, computer);
                System.out.println();
                computerWins++;
            }
            numOfGames++;
        }
    }

    public static String computerMove() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return RockPaperScissors.values()[randomNumber].getValue();
    }

    public static boolean playerWins(String playerMove, String computerMove) {
        return playerMove.equals(RockPaperScissors.ROCK.value) && computerMove.equals(RockPaperScissors.SCISSORS.value)
                || playerMove.equals(RockPaperScissors.PAPER.value) && computerMove.equals(RockPaperScissors.ROCK.value)
                || playerMove.equals(RockPaperScissors.SCISSORS.value) && computerMove.equals(RockPaperScissors.PAPER.value);
    }

    public static void pcWins(String playerMove, String computerMove){
        if (computerMove.equals(RockPaperScissors.SCISSORS.value) && playerMove.equals(RockPaperScissors.PAPER.value)){
            System.out.println("Scissors cut paper, I won!");
        } else if (computerMove.equals(RockPaperScissors.ROCK.value) && playerMove.equals(RockPaperScissors.SCISSORS.value)){
            System.out.println("Rock breaks Scissors, I won!");
        } else if (computerMove.equals(RockPaperScissors.PAPER.value) && playerMove.equals(RockPaperScissors.ROCK.value)){
            System.out.println("Paper covers Rock, I won!");
        }
    }
}


