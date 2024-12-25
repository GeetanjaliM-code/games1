import java.util.Scanner;

public class ReactionTimer {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Get ready...");
        Thread.sleep((int) (Math.random() * 5000) + 1000);

        System.out.println("Press ENTER now!");
        long startTime = System.currentTimeMillis();
        new Scanner(System.in).nextLine();
        long endTime = System.currentTimeMillis();

        System.out.println("Your reaction time is " + (endTime - startTime) + " milliseconds.");
    }
}
