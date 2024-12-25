import java.util.Random;

public class SudokuGenerator {
    public static void main(String[] args) {
        int[][] board = generateSudoku();
        printBoard(board);
    }

    private static int[][] generateSudoku() {
        int[][] board = new int[9][9];
        Random random = new Random();

        for (int i = 0; i < 9; i++) {
            board[i][i] = random.nextInt(9) + 1;
        }

        return board;
    }

    private static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print((cell == 0 ? "." : cell) + " ");
            }
            System.out.println();
        }
    }
}
