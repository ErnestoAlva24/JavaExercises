import java.util.Scanner;

import javax.swing.InputMap;

public class Save {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial amount: ");
        double amount = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double interest = input.nextDouble();

        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double save = 0;

        for (int i = 0; i < months; i++)
            save = (amount + save) * (1 + interest / 100 / 12);

        System.out.println("The amount is $" + save);
    }
}
