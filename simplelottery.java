import java.util.HashSet;
import java.util.Scanner;

public class SimpleLottery {
    public static void main(String[] args) {
        HashSet<Integer> lottery = new HashSet<>();
        while (lottery.size() < 3) {
            lottery.add((int) (Math.random() * 10));
        }

        System.out.println("Pick 3 numbers (0-9):");
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> guess = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            guess.add(scanner.nextInt());
        }

        lottery.retainAll(guess);
        System.out.println("Matches: " + lottery.size());
        System.out.println("Lottery numbers: " + lottery);
    }
}
