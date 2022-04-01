import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String numberStr = input.nextLine();

        if (numberStr.length() < 12) {
            System.out.println(numberStr + " is an invalid input");
            System.exit(0);
        }

        int d13 = 0;
        String digits = "";

        for (int i = 1; i < 13; i++) {
            int digit = numberStr.charAt(i - 1) - 48;

            if (i % 2 == 1)
                d13 += digit * 3;
            else
                d13 += digit;

            digits += digit;
        }

        d13 = 10 - d13 % 10;

        if (d13 == 10)
            System.out.println("The ISBN-13 number is " + digits + "0");
        else
            System.out.println("The ISBN-13 number is " + digits + d13);
    }
}
