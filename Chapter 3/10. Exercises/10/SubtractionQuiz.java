import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 1000);
        int number2 = (int) (Math.random() * 1000);

        System.out.print("What is " + number1 + " x " + number2 + "? ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 * number2 == answer)
            System.out.println("You are correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " x " + number2 + " should be " + (number1 * number2));
        }
    }
}
