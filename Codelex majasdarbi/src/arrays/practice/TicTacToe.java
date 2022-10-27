package arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initBoard();
        int row;
        int col;
        boolean playerX = true;
        boolean gameEnded = false;
        char symbol = ' ';

        while (!gameEnded) {
            displayBoard();

            if (playerX) {
                playerX = true;
                symbol = 'X';
            } else {
                playerX = false;
                symbol = 'O';
            }

            while (true) {
                Scanner keyboard = new Scanner(System.in);
                System.out.print(symbol + ", choose your location (row, column): ");
                row = keyboard.nextInt();
                col = keyboard.nextInt();

                if (row < 0 || col < 0 || row > 2 || col > 2) {
                    System.out.println("Invalid input! ");
                } else if (board[row][col] != ' ') {
                    System.out.println("The spot is already filled.");
                } else {
                    break;
                }
            }

            board[row][col] = symbol;
            if (findWinner(board) == 'X') {
                System.out.println("Player X has won!");
                gameEnded = true;
            } else if (findWinner(board) == 'O') {
                System.out.println("Player O has won!");
                gameEnded = true;
            } else {
                if (itsATie(board)) {
                    System.out.println("It's a tie!");
                    gameEnded = true;
                } else {
                    playerX = !playerX;
                }
            }
        }
        displayBoard();
    }

    private static char findWinner(char[][] board) {
        if (board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != ' ') {
            return board[0][0];
        } else if (board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != ' ') {
            return board[1][0];
        } else if (board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != ' ') {
            return board[2][0];
        } else if (board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != ' ') {
            return board[1][0];
        } else if (board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != ' ') {
            return board[1][1];
        } else if (board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[2][2] != ' ') {
            return board[2][2];
        } else if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != ' ') {
            return board[2][2];
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] != ' ') {
            return board[2][0];
        } else {
            return ' ';
        }
    }

    public static boolean itsATie(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initBoard() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }


}
