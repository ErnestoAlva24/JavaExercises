import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchange = input.nextDouble();

        System.out.print("Enter 0 to convert dollaras to RMB and 1 to viceversa: ");
        int option = input.nextInt();

        if (option == 0) {
            System.out.print("Enter the dollar amount: ");
            double amonut = input.nextDouble();

            double convertion = amonut * exchange;

            System.out.println("$" + amonut + " is " + convertion + " yuan");
        } else if (option == 1) {
            System.out.print("Enter the RMB amount: ");
            double amonut = input.nextDouble();

            double convertion = amonut / exchange;

            System.out.println(amonut + " yuan is $" + convertion);
        } else
            System.out.println("Incorrect input");
    }
}
