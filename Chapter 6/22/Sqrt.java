import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        double root = sqrt(n);

        System.out.println("The square root of " + n + " is " + root);
    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = 1;

        do {
            lastGuess = nextGuess;
            nextGuess = ((lastGuess + n) / lastGuess) / 2;

        } while (Math.abs(lastGuess - nextGuess) > 0.0001);

        return nextGuess;
    }
}
