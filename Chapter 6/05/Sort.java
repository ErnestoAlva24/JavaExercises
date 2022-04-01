import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter te first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter te second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter te third number: ");
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 < num2) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }
        if (num1 < num3) {
            num1 = num1 + num3;
            num3 = num1 - num3;
            num1 = num1 - num3;
        }
        if (num2 < num3) {
            num2 = num2 + num3;
            num3 = num2 - num3;
            num2 = num2 - num3;
        }

        System.out.println(num1 + ", " + num2 + ", " + num3);
    }
}
