import java.util.Scanner;

public class MonthlySaving {
    public static void main(String[] args) {
        final double interestRate = 0.003125;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double monthlyAmount = input.nextDouble();

        double monthlySaving = monthlyAmount * (1 + interestRate);
        System.out.println("After the first monthly saving amount: " + monthlySaving);

        monthlySaving = (monthlyAmount + monthlySaving) * (1 + interestRate);
        System.out.println("After the second monthly saving amount: " + monthlySaving);

        monthlySaving = (monthlyAmount + monthlySaving) * (1 + interestRate);
        System.out.println("After the third monthly saving amount: " + monthlySaving);

        monthlySaving = (monthlyAmount + monthlySaving) * (1 + interestRate);
        System.out.println("After the fourth monthly saving amount: " + monthlySaving);

        monthlySaving = (monthlyAmount + monthlySaving) * (1 + interestRate);
        System.out.println("After the fifth monthly saving amount: " + monthlySaving);

        monthlySaving = (monthlyAmount + monthlySaving) * (1 + interestRate);
        System.out.println("After the sixth monthly saving amount: " + monthlySaving);
    }
}