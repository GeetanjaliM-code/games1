import java.util.Scanner;

public class TypingSpeedTest {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println("Type this as fast as you can:\n" + sentence);

        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        if (input.equals(sentence)) {
            double timeTaken = (endTime - startTime) / 1000.0;
            System.out.println("Well done! You took " + timeTaken + " seconds.");
        } else {
            System.out.println("Incorrect typing! Try again.");
        }
    }
}
