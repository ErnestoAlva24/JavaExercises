import java.util.Arrays;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = -1;
        int[] count = new int[50];

        Arrays.fill(count, 0);

        System.out.print("Enter the integer between 1 and 50: ");

        while (true) {
            number = input.nextInt();

            if (number == 0)
                break;

            count[number - 1]++;
        }

        for (int i = 0; i < 50; i++) {
            if (count[i] == 1)
                System.out.println((i + 1) + " occurs " + count[i] + " time");
            else if (count[i] > 1)
                System.out.println((i + 1) + " occurs " + count[i] + " times");
        }
    }
}
