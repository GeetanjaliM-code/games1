import java.util.Scanner;

public class WordGuessingGame {
    public static void main(String[] args) {
        String[] words = {"JAVA", "PYTHON", "SWIFT", "KOTLIN"};
        String word = words[(int) (Math.random() * words.length)];
        char[] guessed = new char[word.length()];
        for (int i = 0; i < guessed.length; i++) guessed[i] = '_';

        Scanner scanner = new Scanner(System.in);
        int attempts = 6;

        while (attempts > 0) {
            System.out.println("Word: " + new String(guessed));
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toUpperCase().charAt(0);

            boolean correct = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessed[i] = guess;
                    correct = true;
                }
            }

            if (!correct) {
                attempts--;
                System.out.println("Wrong guess! Attempts remaining: " + attempts);
            }

            if (new String(guessed).equals(word)) {
                System.out.println("You won! The word was: " + word);
                return;
            }
        }

        System.out.println("You lost! The word was: " + word);
    }
}
