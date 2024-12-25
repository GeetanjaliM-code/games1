import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String word = "JAVA";
        StringBuilder hidden = new StringBuilder("____");
        int attempts = 6;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0 && hidden.toString().contains("_")) {
            System.out.println("Word: " + hidden);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toUpperCase().charAt(0);

            if (word.contains(String.valueOf(guess))) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        hidden.setCharAt(i, guess);
                    }
                }
            } else {
                attempts--;
                System.out.println("Incorrect! Attempts left: " + attempts);
            }
        }

        if (hidden.toString().equals(word)) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Game over! The word was: " + word);
        }
    }
}
