import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class WordScramble {
    public static void main(String[] args) {
        String word = "PROGRAMMING";
        char[] scrambled = word.toCharArray();
        Collections.shuffle(Arrays.asList(scrambled));

        System.out.println("Unscramble this word: " + new String(scrambled));
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();

        if (guess.equalsIgnoreCase(word)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect! The word was " + word);
        }
    }
}
