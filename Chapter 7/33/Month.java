import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "september",
                "October", "November" };

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 12: ");
        int month = input.nextInt();

        System.out.println("The month is " + months[month - 1]);
    }
}
