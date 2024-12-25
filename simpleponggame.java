import java.util.Scanner;

public class PongGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player = 5, ball = 5, direction = 1;

        System.out.println("Control the paddle with 1 (move down) and -1 (move up).");

        while (true) {
            System.out.print("Player at: " + player + ", Ball at: " + ball + ". Enter move: ");
            int move = scanner.nextInt();
            player += move;

            if (player == ball) {
                System.out.println("Paddle hit the ball! You win!");
                break;
            }

            ball += direction;
            if (ball == 0 || ball == 10) direction = -direction;
        }
    }
}
