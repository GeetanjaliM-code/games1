public class SnakeEyesGame {
    public static void main(String[] args) {
        int die1, die2;
        int rolls = 0;

        do {
            die1 = (int) (Math.random() * 6) + 1;
            die2 = (int) (Math.random() * 6) + 1;
            rolls++;
            System.out.println("Rolled: " + die1 + " and " + die2);
        } while (die1 != 1 || die2 != 1);

        System.out.println("Snake Eyes! It took " + rolls + " rolls.");
    }
}
