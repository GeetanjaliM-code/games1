import java.util.Scanner;

public class MazeEscape {
    public static void main(String[] args) {
        char[][] maze = {
            {'S', ' ', '#', ' '},
            {' ', '#', ' ', ' '},
            {' ', ' ', '#', 'E'}
        };
        int playerX = 0, playerY = 0;
        Scanner scanner = new Scanner(System.in);

        while (maze[playerX][playerY] != 'E') {
            printMaze(maze, playerX, playerY);
            System.out.print("Enter move (W/A/S/D): ");
            char move = scanner.next().toUpperCase().charAt(0);

            int newX = playerX, newY = playerY;
            switch (move) {
                case 'W': newX--; break;
                case 'A': newY--; break;
                case 'S': newX++; break;
                case 'D': newY++; break;
            }

            if (newX >= 0 && newX < maze.length && newY >= 0 && newY < maze[0].length && maze[newX][newY] != '#') {
                playerX = newX;
                playerY = newY;
            } else {
                System.out.println("Can't move there!");
            }
        }

        System.out.println("You escaped the maze!");
    }

    private static void printMaze(char[][] maze, int playerX, int playerY) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                if (i == playerX && j == playerY) System.out.print("P ");
                else System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }
}
