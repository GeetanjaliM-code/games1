import java.util.Scanner;

public class MemoryNumberGame {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 1000);
        System.out.println("Memorize this number: " + number);
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        System.out.print("\033[H\033[2J"); // Clear console (may not work on all systems)

        System.out.println("What was the number?");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The number was " + number);
        }
    }
}
