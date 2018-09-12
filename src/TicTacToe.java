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
        System.out.println("\n  Hi, Welcome To The Tic Tac Toe Game!\n");
        showBoard(board);

        // ask the user to enter their name
        System.out.print("  Please, enter Player 1's name: ");
        String player1Name = sc.next();

        System.out.print("  Please, enter Player 2's name: ");
        String player2Name = sc.next();

        // Then ask the first player which symbol (x or o) he/she wants to play with.
        System.out.print("\n  " + player1Name+ ", choose a symbol to play with, \"x\" or \"o\"? ");
        char player1Symbol = sc.next().toLowerCase().charAt(0);
        char player2Symbol = (player1Symbol == 'x') ? 'o' : 'x';
        System.out.print("  => " + player2Name+ " will play with the '" + ((player1Symbol == 'x') ? 'o' : 'x' )+ "' symbol.\n");

        System.out.print("\n  " + player1Name + ", would you like to play first (y/n)? ");
        char playerAns = sc.next().toLowerCase().charAt(0);

        int turn; // 0 for player 1, 1 for player2
        int remainCnt = SIZE * SIZE; // empty cell count

        // this is going to be the first move
        if (playerAns == 'y') {
            turn = 0;
            user1Play(board, player1Symbol); // player 1 places their first move
        }
        else {
            turn = 1;
            user2Play(board, player2Symbol); // player 2 placed their first move
        }

        // show the board
        showBoard(board);
        // decrement the number of remaining cells
        remainCnt--;

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
   public static void user1Play(char[][] bd, char u1turn)
    {
        System.out.print("\n  Please enter a row and a column to play: ");
        int rowIndex = sc.nextInt();
        int colIndex = sc.nextInt();

        while (bd[rowIndex][colIndex] != ' ') {
            System.out.print("\n   It looks like this cell is already taken....\nPlease enter a row and a column to play: ");
            rowIndex = sc.nextInt();
            colIndex = sc.nextInt();
        }

        bd[rowIndex][colIndex] = u1turn;
    }
    public static void user2Play(char[][] bd, char u2turn)
    {
        System.out.print("\n  Please enter a row and a column to play: ");
        int rowIndex = sc.nextInt();
        int colIndex = sc.nextInt();

        while (bd[rowIndex][colIndex] != ' ') {
            System.out.print("\n   It looks like this cell is already taken....\nPlease enter a row and a column to play: ");
            rowIndex = sc.nextInt();
            colIndex = sc.nextInt();
        }

        bd[rowIndex][colIndex] = u2turn;
    }
}
