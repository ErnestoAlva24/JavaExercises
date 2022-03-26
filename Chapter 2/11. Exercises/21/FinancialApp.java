import java.util.Scanner;

public class FinancialApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double interest = input.nextDouble();

        System.out.print("Enter nunmber of years: ");
        int years = input.nextInt();

        double value = investment * Math.pow(1 + interest / 100 / 12, years * 12);

        System.out.println("Future value is $" + value);
    }
}
