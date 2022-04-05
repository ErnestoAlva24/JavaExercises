import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = input.nextInt();

        int[] values = new int[n];

        System.out.print("Enter the values: ");

        for (int i = 0; i < n; i++)
            values[i] = input.nextInt();

        if (isConsecutiveFour(values))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }

    public static boolean isConsecutiveFour(int[] values) {
        int value = -1;
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (value != values[i]) {
                value = values[i];
                count = 1;
            } else {
                count++;

                if (count == 4)
                    return true;
            }
        }

        return false;
    }
}
