import java.rmi.Remote;
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in int, for example 11.56 = 1156: ");
        int amount = input.nextInt();

        int reaminingAmount = amount;
        int numberOfOneDollars = reaminingAmount / 100;
        reaminingAmount = reaminingAmount % 100;

        int numberOfQuarters = reaminingAmount / 25;
        reaminingAmount = reaminingAmount % 25;

        int numberOfDimes = reaminingAmount / 10;
        reaminingAmount = reaminingAmount % 10;

        int numberOfNickels = reaminingAmount / 5;
        reaminingAmount = reaminingAmount % 5;

        int numberOfPennies = reaminingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
