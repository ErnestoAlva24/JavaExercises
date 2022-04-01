import java.util.Scanner;

public class Octal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        String octal = "";

        while (decimal > 7) {
            int digit = decimal % 8;

            octal = digit + octal;
            decimal /= 8;
        }

        if (decimal > 0)
            octal = decimal + octal;

        System.out.println(octal);
    }
}
