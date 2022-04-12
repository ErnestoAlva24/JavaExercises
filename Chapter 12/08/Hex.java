import java.util.Scanner;

public class Hex {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number "
                    + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } catch (HexFormatException ex) {
            System.out.println("Invalid input");
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            try {
                decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
            } catch (HexFormatException ex) {
                throw ex;
            }
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) throws HexFormatException {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else if (ch >= '0' && ch <= '9')// ch is '0', '1', ..., or '9'
            return ch - '0';
        else
            throw new HexFormatException();
    }

    public static class HexFormatException extends Exception {
        public HexFormatException() {
            super();
        }
    }
}
