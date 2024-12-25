public class CoinToss {
    public static void main(String[] args) {
        String result = Math.random() < 0.5 ? "Heads" : "Tails";
        System.out.println("The coin landed on " + result + "!");
    }
}
