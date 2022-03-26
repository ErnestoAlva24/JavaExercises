import java.util.Scanner;

public class SquareToPing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in square meters: ");
        double squareMeters = input.nextDouble();

        double pings = squareMeters * 0.3025;

        System.out.println(squareMeters + " square meters is " + pings + " pings");
    }
}
