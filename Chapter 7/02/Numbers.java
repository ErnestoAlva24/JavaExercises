import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[11];

        System.out.print("Enter 11 integers: ");

        for (int i = 0; i < 11; i++)
            numbers[i] = input.nextInt();

        for (int i = 0; i < 11; i++) {
            if (numbers[i] < numbers[10])
                System.out.println((i + 1) + "th Number " + " is smalller than the 11th integer");
            else if (numbers[i] == numbers[10])
                System.out.println((i + 1) + "th Number " + " is equal than the 11th integer");
            else
                System.out.println((i + 1) + "th Number " + " is greater than the 11th integer");
        }
    }
}
