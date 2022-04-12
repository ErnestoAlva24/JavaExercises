import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String binary = input.nextLine();

        try {
            System.out.println("Decimal value is " + bin2Dec(binary));
        } catch (BinaryFormatException ex) {
            System.out.println("Invalid Input");
        }
    }

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        int decimal = 0;
        for (int i = 0, j = binaryString.length() - 1; i < binaryString.length(); i++, j--) {
            if (binaryString.charAt(i) < '0' || binaryString.charAt(i) > '1')
                throw new BinaryFormatException();

            decimal += (Integer.parseInt(String.valueOf(binaryString.charAt(i)))) * Math.pow(2, j);
        }
        return decimal;
    }

    public static class BinaryFormatException extends NumberFormatException {
        public BinaryFormatException() {
            super();
        }
    }
}
