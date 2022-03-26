import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        double kilometers = miles * 1.6;

        System.out.println(miles + " is " + kilometers + " kilometers");
    }
}
