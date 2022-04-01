import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println(reverse(number));
    }

    public static int reverse(int number) {
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number = number / 10;
        }

        return reverse;
    }
}
