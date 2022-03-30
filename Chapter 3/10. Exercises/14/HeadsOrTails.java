import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the guess selection (0 = head, 1 = tail): ");
        int guess = input.nextInt();

        int coin = ((int) ((Math.random() * (10 - 1)) + 1)) % 2;
        String result;

        if (coin == 0)
            result = "head";
        else
            result = "tail";

        if (coin == guess)
            System.out.println(result + ", the guess is correct");
        else
            System.out.println(result + ", the guess is incorrect");
    }
}
