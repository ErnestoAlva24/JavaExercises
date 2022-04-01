import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();
        String binary = "";

        while (decimal > 1) {
            int digit = decimal % 2;

            binary = digit + binary;
            decimal /= 2;
        }

        if (decimal == 1)
            binary = decimal + binary;

        System.out.println(binary);
    }
}
