import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String line = input.next();

        char c = line.charAt(0);

        System.out.println("The ASCII code for character " + c + " is " + (int) c);
    }
}
