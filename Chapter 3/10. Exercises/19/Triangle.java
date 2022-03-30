import java.util.Scanner;

public class Triangle {
    public static void main(String[] main) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the three edges of the triangle: ");
        double e1 = input.nextDouble();
        double e2 = input.nextDouble();
        double e3 = input.nextDouble();

        if (e1 + e2 > e3 && e1 + e3 > e2 && e2 + e3 > e1) {
            double perimeter = e1 + e2 + e3;

            System.out.println("The perimeter is " + perimeter);
        } else
            System.out.println("The input is invalid");
    }
}
