import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        final float secondsByYear = 365 * 24 * 60 * 60;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double population = 312032486 + years * (secondsByYear / 7.0 - secondsByYear / 13.0 + secondsByYear / 45.0);

        System.out.print("The population in " + years + " years is " + population);
    }
}