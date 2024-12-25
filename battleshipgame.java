import java.util.Scanner;

public class BattleshipGame {
    public static void main(String[] args) {
        char[][] board = new char[5][5];
        for (int i = 0; i < 5; i++) for (int j = 0; j < 5; j++) board[i][j] = '~';
        
        int shipX = (int) (Math.random() * 5);
        int shipY = (int) (Math.random() * 5);
        int attempts = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Battleship! Sink the ship.");
        while (attempts > 0) {
            System.out.println("Attempts remaining: " + attempts);
            printBoard(board);
            System.out.print("Enter your guess (row and column, 0-4): ");
            int guessX = scanner.nextInt();
            int guessY = scanner.nextInt();

            if (guessX == shipX && guessY == shipY) {
                board[guessX][guessY] = 'S';
                System.out.println("You sunk the ship!");
                break;
            } else {
                board[guessX][guessY] = 'X';
                System.out.println("Miss!");
            }
            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Game over! The ship was at (" + shipX + ", " + shipY + ").");
        }
        printBoard(board);
    }

    private static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
