import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        String[] words = {"PROGRAMMING", "JAVA", "COMPUTER", "KEYBOARD", "MOUSE"};
        String word = words[(int) (Math.random() * words.length)];
        char[] guessedWord = new char[word.length()];
        for (int i = 0; i < guessedWord.length; i++) guessedWord[i] = '_';

        int attempts = 6;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("Word: " + new String(guessedWord));
            System.out.println("Attempts left: " + attempts);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toUpperCase().charAt(0);

            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Wrong guess!");
            }

            if (new String(guessedWord).equals(word)) {
                System.out.println("You guessed it! The word was: " + word);
                return;
            }
        }

        System.out.println("Game Over! The word was: " + word);
    }
}
