import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight: ");
        double weight = input.nextDouble();

        if (weight <= 2)
            System.out.println("The shipping cost is $2.5");
        else if (weight > 2 && weight <= 4)
            System.out.println("The shipping cost is $4.5");
        else if (weight > 4 && weight <= 10)
            System.out.println("The shipping cost is $7.5");
        else if (weight > 10 && weight <= 20)
            System.out.println("The shipping cost is $10.5");
        else
            System.out.println("the package cannot be shipped.");
    }
}
