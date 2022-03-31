import java.util.Scanner;

public class ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = input.nextLine();

        int length = str.length();

        System.out.println("The string length is " + length);
        System.out.println("the last character is " + str.charAt(length - 1));
    }
}
