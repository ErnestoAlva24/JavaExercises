import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();

        int d9 = number % 10;
        int d8 = number / 10 % 10;
        int d7 = number / 100 % 10;
        int d6 = number / 1000 % 10;
        int d5 = number / 10000 % 10;
        int d4 = number / 100000 % 10;
        int d3 = number / 1000000 % 10;
        int d2 = number / 10000000 % 10;
        int d1 = number / 100000000 % 10;

        int d10 = (d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11;

        if (d10 == 10)
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        else
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
    }
}
