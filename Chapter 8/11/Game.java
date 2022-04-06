import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();

        String binary = Integer.toBinaryString(number);

        int length = binary.length();

        for (int i = 0; i < 9 - length; i++)
            binary = "0" + binary;

        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0')
                System.out.print("H ");
            else
                System.out.print("T ");

            count++;

            if (count == 3) {
                count = 0;
                System.out.println();
            }
        }
    }
}
