import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();

        int d10 = 0;
        String digits = "";

        for (int i = 1; i < 10; i++) {
            int digit = (number / (int) Math.pow(10, i - 1)) % 10;

            d10 += digit * (10 - i);
            digits = digit + digits;
        }

        d10 %= 11;

        if (d10 == 10)
            System.out.println("The ISBN-10 number is " + digits + "X");
        else
            System.out.println("The ISBN-10 number is " + digits + d10);
    }
}
