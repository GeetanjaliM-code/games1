import java.util.Scanner;

public class Minesweeper {
    static int rows = 5, cols = 5, mines = 5;
    static char[][] board = new char[rows][cols];
    static boolean[][] revealed = new boolean[rows][cols];

    public static void main(String[] args) {
        initializeBoard();
        placeMines();
        playGame();
    }

    static void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '0';
                revealed[i][j] = false;
            }
        }
    }

    static void placeMines() {
        int count = 0;
        while (count < mines) {
            int x = (int) (Math.random() * rows);
            int y = (int) (Math.random() * cols);
            if (board[x][y] != 'M') {
                board[x][y] = 'M';
                updateNumbers(x, y);
                count++;
            }
        }
    }

    static void updateNumbers(int x, int y) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nx = x + i, ny = y + j;
                if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && board[nx][ny] != 'M') {
                    board[nx][ny]++;
                }
            }
        }
    }

    static void playGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printBoard(false);
            System.out.print("Enter row and column to reveal (e.g., 1 1): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < 0 || x >= rows || y < 0 || y >= cols) {
                System.out.println("Invalid position!");
                continue;
            }

            if (board[x][y] == 'M') {
                System.out.println("Boom! Game over.");
                printBoard(true);
                break;
            }

            reveal(x, y);
            if (checkWin()) {
                System.out.println("You win! All non-mined cells revealed.");
                printBoard(true);
                break;
            }
        }
    }

    static void reveal(int x, int y) {
        if (x < 0 || y < 0 || x >= rows || y >= cols || revealed[x][y]) return;

        revealed[x][y] = true;
        if (board[x][y] == '0') {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    reveal(x + i, y + j);
                }
            }
        }
    }

    static boolean checkWin() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!revealed[i][j] && board[i][j] != 'M') {
                    return false;
                }
            }
        }
        return true;
    }

    static void printBoard(boolean revealAll) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (revealAll || revealed[i][j]) {
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
