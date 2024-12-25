import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String question = "What is the capital of France?";
        String answer = "Paris";
        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The correct answer is " + answer);
        }
    }
}
