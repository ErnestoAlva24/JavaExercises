import java.util.Scanner;

public class Cost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double miles = input.nextDouble();

        System.out.print("Enter the price per gallon: ");
        double price = input.nextDouble();

        double cost = distance / miles * price;

        System.out.println("The cost of driving is $" + cost);
    }
}
