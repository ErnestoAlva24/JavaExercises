import java.util.Scanner;

public class MetersToFeets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for meter: ");
        double meters = input.nextInt();

        double feets = meters * 3.2786;

        System.out.println(meters + " is " + feets + " feet");
    }
}
