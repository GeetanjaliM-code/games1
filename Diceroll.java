public class DiceRollingGame {
    public static void main(String[] args) {
        int diceRoll = (int) (Math.random() * 6) + 1;
        System.out.println("You rolled a " + diceRoll + "!");
    }
}
