import java.util.Scanner;

public class SimpleBlackjack {
    public static void main(String[] args) {
        int playerCard1 = (int) (Math.random() * 10) + 1;
        int playerCard2 = (int) (Math.random() * 10) + 1;
        int playerTotal = playerCard1 + playerCard2;

        int dealerCard1 = (int) (Math.random() * 10) + 1;
        int dealerCard2 = (int) (Math.random() * 10) + 1;
        int dealerTotal = dealerCard1 + dealerCard2;

        System.out.println("Your cards: " + playerCard1 + " and " + playerCard2 + " (Total: " + playerTotal + ")");
        System.out.println("Dealer shows: " + dealerCard1);

        System.out.println("Hit or stay?");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Hit")) {
            int newCard = (int) (Math.random() * 10) + 1;
            playerTotal += newCard;
            System.out.println("You drew a " + newCard + " (Total: " + playerTotal + ")");
        }

        System.out.println("Dealer's total: " + dealerTotal);
        if (playerTotal > 21 || (dealerTotal <= 21 && dealerTotal >= playerTotal)) {
            System.out.println("You lose!");
        } else {
            System.out.println("You win!");
        }
    }
}
