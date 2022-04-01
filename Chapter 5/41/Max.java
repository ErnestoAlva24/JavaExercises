import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        System.out.print("Enter numbers: ");

        int max = 0, count = 0;

        do {
            number = input.nextInt();

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max)
                count++;
        } while (number != 0);

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
    }
}
