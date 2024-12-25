import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args) {
        char[][] board = new char[6][7];
        for (int i = 0; i < 6; i++) for (int j = 0; j < 7; j++) board[i][j] = '.';

        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'R';

        while (true) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", choose a column (0-6): ");
            int col = scanner.nextInt();

            if (col < 0 || col > 6 || board[0][col] != '.') {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            int row = dropDisc(board, col, currentPlayer);
            if (checkWin(board, row, col)) {
                printBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            currentPlayer = (currentPlayer == 'R') ? 'Y' : 'R';
        }
    }

    private static int dropDisc(char[][] board, int col, char player) {
        for (int row = 5; row >= 0; row--) {
            if (board[row][col] == '.') {
                board[row][col] = player;
                return row;
            }
        }
        return -1;
    }

    private static boolean checkWin(char[][] board, int row, int col) {
        char player = board[row][col];
        return checkDirection(board, row, col, 1, 0, player) ||  // Horizontal
               checkDirection(board, row, col, 0, 1, player) ||  // Vertical
               checkDirection(board, row, col, 1, 1, player) ||  // Diagonal /
               checkDirection(board, row, col, 1, -1, player);   // Diagonal \
    }

    private static boolean checkDirection(char[][] board, int row, int col, int dr, int dc, char player) {
        int count = 1;
        for (int i = 1; i < 4; i++) {
            int r = row + dr * i, c = col + dc * i;
            if (r >= 0 && r < 6 && c >= 0 && c < 7 && board[r][c] == player) count++;
            else break;
        }
        for (int i = 1; i < 4; i++) {
            int r = row - dr * i, c = col - dc * i;
            if (r >= 0 && r < 6 && c >= 0 && c < 7 && board[r][c] == player) count++;
            else break;
        }
        return count >= 4;
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
