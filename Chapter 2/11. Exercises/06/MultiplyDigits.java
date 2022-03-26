import java.util.Scanner;

public class MultiplyDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int d1 = number % 10;
        number = number / 10;

        int d2 = number % 10;
        number = number / 10;

        int d3 = number;

        int multiplication = d1 * d2 * d3;
        number = d1 + d2 * 10 + d3 * 100;

        System.out.println("The multiplication of all digits in " + number + " is " + multiplication);
    }
}
