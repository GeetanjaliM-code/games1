import java.util.Scanner;

public class MemoryMatchGame {
    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 1, 2, 3};
        boolean[] revealed = new boolean[cards.length];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Card positions: ");
            for (int i = 0; i < cards.length; i++) {
                if (revealed[i]) {
                    System.out.print(cards[i] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

            System.out.print("Pick two cards (0-5): ");
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            if (cards[first] == cards[second]) {
                revealed[first] = revealed[second] = true;
                System.out.println("Match found!");
            } else {
                System.out.println("No match.");
            }

            boolean allRevealed = true;
            for (boolean r : revealed) {
                if (!r) {
                    allRevealed = false;
                    break;
                }
            }
            if (allRevealed) {
                System.out.println("You matched all the cards! You win!");
                break;
            }
        }
    }
}
