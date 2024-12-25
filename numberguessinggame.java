import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 100:");
        while (true) {
            int guess = scanner.nextInt();
            attempts++;
            if (guess == numberToGuess) {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
    }
}
