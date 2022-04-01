import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int d = 0;

        if (n1 < n2)
            d = n1;
        else
            d = n2;

        while (d > 1) {
            if (n1 % d == 0 && n2 % d == 0)
                break;
            d--;
        }

        System.out.println("The greatest common divisor for " + n1 +
                " and " + n2 + " is " + d);
    }
}
