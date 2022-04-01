import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println("Is palindrome: " + isPalindrome(number));
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
