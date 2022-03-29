import java.rmi.Remote;
import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int reaminingAmount = (int) (amount * 100);
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

        if (numberOfOneDollars > 1)
            System.out.println(" " + numberOfOneDollars + " dollars");
        else if (numberOfOneDollars == 1)
            System.out.print(" " + numberOfOneDollars + " dollar");

        if (numberOfQuarters > 1)
            System.out.println(" " + numberOfQuarters + " quarters ");
        else if (numberOfQuarters == 1)
            System.out.println(" " + numberOfQuarters + " quarter ");

        if (numberOfDimes > 1)
            System.out.println(" " + numberOfDimes + " dimes");
        else if (numberOfDimes == 1)
            System.out.println(" " + numberOfDimes + " dime");

        if (numberOfNickels > 1)
            System.out.println(" " + numberOfNickels + " nickels");
        else if (numberOfNickels == 1)
            System.out.println(" " + numberOfNickels + " nickel");

        if (numberOfPennies > 1)
            System.out.println(" " + numberOfPennies + " pennies");
        else if (numberOfPennies == 1)
            System.out.println(" " + numberOfPennies + " penny");
    }
}
