import java.util.Scanner;

public class CheckISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String number = input.nextLine();

        int d9 = number.charAt(8) - 48;
        int d8 = number.charAt(7) - 48;
        int d7 = number.charAt(6) - 48;
        int d6 = number.charAt(5) - 48;
        int d5 = number.charAt(4) - 48;
        int d4 = number.charAt(3) - 48;
        int d3 = number.charAt(2) - 48;
        int d2 = number.charAt(1) - 48;
        int d1 = number.charAt(0) - 48;

        int d10 = (d1 + 2 * d2 + 3 * d3 + 4 * d4 + 5 * d5 + 6 * d6 + 7 * d7 + 8 * d8 + 9 * d9) % 11;

        if (d10 == 10)
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
        else
            System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
    }
}
