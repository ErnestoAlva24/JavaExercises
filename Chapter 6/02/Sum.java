import java.util.Scanner;

import javax.swing.InputMap;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long number = input.nextLong();

        System.out.println(sumDigits(number));
    }

    public static int sumDigits(long n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }
}
