import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October",
                "November", "December" };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 12: ");
        int number = input.nextInt();

        try {
            System.out.print(months[number - 1] + " has " + dom[number - 1] + " days");
        } catch (ArrayIndexOutOfBoundsException es) {
            System.out.println("Wrong number");
        }
    }
}
