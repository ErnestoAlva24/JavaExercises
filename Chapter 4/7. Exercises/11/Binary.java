import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary digits (0000 to 1111): ");
        String binary = input.nextLine();

        int value = (binary.charAt(0) - 48) * 8 + (binary.charAt(1) - 48) * 4 + (binary.charAt(2) - 48) * 2
                + (binary.charAt(3) - 48);

        System.out.println("The decimal value is " + value);
    }
}
