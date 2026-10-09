import java.util.Scanner;

public class TicTacToe {

    static Scanner input = new Scanner(System.in);
    static char[][] board = new char[3][3];
    static char player = 'X';

    public static void main(String[] args) {

        initializeBoard();

        System.out.println("=== TIC TAC TOE ===");

        while (true) {

            displayBoard();
            getNextMove();

            if (checkWinner(player)) {
                displayBoard();
                System.out.println("Player " + player + " wins!");
                break;
            }

            if (isBoardFull()) {
                displayBoard();
                System.out.println("It's a tie!");
                break;
            }

            switchPlayer();
        }

        input.close();
    }

    public static void initializeBoard() {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                board[row][col] = ' ';
            }
        }
    }

    public static void displayBoard() {

        System.out.println();

        for (int row = 0; row < 3; row++) {

            System.out.println(
                    " " + board[row][0] +
                    " | " + board[row][1] +
                    " | " + board[row][2]
            );

            if (row < 2) {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }

    public static void getNextMove() {

        while (true) {

            System.out.println("Player " + player + ", enter row (1-3):");
            int row = input.nextInt() - 1;

            System.out.println("Player " + player + ", enter column (1-3):");
            int col = input.nextInt() - 1;

            if (row < 0 || row >= 3 || col < 0 || col >= 3) {
                System.out.println("Invalid position. Please enter numbers from 1 to 3.");
                continue;
            }

            if (board[row][col] != ' ') {
                System.out.println("That position is already taken.");
                continue;
            }

            board[row][col] = player;
            break;
        }
    }

    public static boolean checkWinner(char player) {

        // Check rows and columns
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {

                return true;
            }

            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {

                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {

            return true;
        }

        // Check other diagonal
        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {

            return true;
        }

        return false;
    }

    public static boolean isBoardFull() {

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void switchPlayer() {

        if (player == 'X') {
            player = 'O';
        } else {
            player = 'X';
        }
    }
}