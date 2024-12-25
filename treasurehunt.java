import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        int treasureX = (int) (Math.random() * 5);
        int treasureY = (int) (Math.random() * 5);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Find the treasure! Enter X and Y (0-4):");
        while (true) {
            int guessX = scanner.nextInt();
            int guessY = scanner.nextInt();

            if (guessX == treasureX && guessY == treasureY) {
                System.out.println("You found the treasure!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
