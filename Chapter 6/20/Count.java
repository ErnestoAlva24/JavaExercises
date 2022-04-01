import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        System.out.println("The string has " + countLetters(str) + " letters");
    }

    public static int countLetters(String s) {
        return s.length();
    }
}
