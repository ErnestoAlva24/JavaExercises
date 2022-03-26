import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in punds: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double bmi = weight * 0.45359237 / Math.pow(height * 0.0254, 2);
        System.out.println("BMI is " + bmi);
    }
}
