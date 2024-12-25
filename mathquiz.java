import java.util.Scanner;

public class MathQuiz {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 10) + 1;
        int num2 = (int) (Math.random() * 10) + 1;
        int answer = num1 * num2;

        System.out.println("What is " + num1 + " x " + num2 + "?");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == answer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The answer was " + answer);
        }
    }
}
