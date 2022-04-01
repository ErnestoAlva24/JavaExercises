import java.util.Scanner;

public class FinancialApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investment = input.nextDouble();

        System.out.print("Annual interest rate in: ");
        double interest = input.nextDouble();

        System.out.println("Years   Future Value");

        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "       " + futureInvestmentValue(investment, interest / 100 / 12, i));
        }
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
