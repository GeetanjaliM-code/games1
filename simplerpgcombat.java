import java.util.Scanner;

public class SimpleRPGCombat {
    public static void main(String[] args) {
        int playerHP = 100, enemyHP = 100;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Battle Start! Fight the enemy!");

        while (playerHP > 0 && enemyHP > 0) {
            System.out.println("Your HP: " + playerHP + ", Enemy HP: " + enemyHP);
            System.out.println("Choose an action: 1. Attack  2. Defend");
            int choice = scanner.nextInt();

            int playerDamage = (int) (Math.random() * 20) + 1;
            int enemyDamage = (int) (Math.random() * 15) + 1;

            if (choice == 1) {
                enemyHP -= playerDamage;
                System.out.println("You attack and deal " + playerDamage + " damage!");
            } else {
                playerDamage /= 2;
                System.out.println("You defend and reduce damage!");
            }

            playerHP -= enemyDamage;
            System.out.println("The enemy attacks and deals " + enemyDamage + " damage!");

            if (playerHP <= 0) System.out.println("You have been defeated.");
            if (enemyHP <= 0) System.out.println("You defeated the enemy!");
        }
    }
}
