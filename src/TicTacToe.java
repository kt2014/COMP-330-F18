// COMP 330 F18 Assignment 1
// Team Project
// Student names: Keyti Toromanova, Nigel Castelino

import java.util.Scanner;

public class TicTacToe {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Initializing the game board
        final int SIZE = 3;
        char[][] board = new char[SIZE][SIZE];

        boardReset(board);
        // Display a message to the user, then display the board
        System.out.println("\nHi, Welcome To The Tic Tac Toe Game!\n");
        showBoard(board);

    }
    // a function to reset the board
    public static void boardReset(char[][] bd){
        for (int i=0; i< bd.length; i++)
            for (int j = 0; j < bd[0].length; j++)
                bd[i][j] = ' ';
    }
    // a function to display the board
    public static void showBoard(char[][] bd) {
        int numRow = bd.length;
        int numCol = bd[0].length;
        System.out.println();
        // header for columns
        System.out.print("    ");
        for (int i = 0; i < numCol; i++)
            System.out.print(i + "   ");
        System.out.print('\n');
        System.out.println();

        // draw the table
        for (int i = 0; i < numRow; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < numCol; j++) {
                if (j != 0)
                    System.out.print("|");
                System.out.print(" " + bd[i][j] + " ");
            }

            System.out.println();

            if (i != (numRow - 1)) {
                // separator line
                System.out.print("   ");
                for (int j = 0; j < numCol; j++) {
                    if (j != 0)
                        System.out.print("+");
                    System.out.print("---");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
    }

