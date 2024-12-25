import java.util.Scanner;

public class HigherOrLower {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess if the number is higher or lower than 50.");
        String guess = scanner.nextLine();

        if ((number > 50 && guess.equalsIgnoreCase("Higher")) ||
            (number <= 50 && guess.equalsIgnoreCase("Lower"))) {
            System.out.println("Correct! The number was " + number);
        } else {
            System.out.println("Wrong! The number was " + number);
        }
    }
}
