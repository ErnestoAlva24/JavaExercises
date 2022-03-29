import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        /*
         * ax + by = e
         * cx + dy = f
         * 
         * x = (ed - bf) / (ad - bc)
         * y = (af - ec) / (ad - bc)
         */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double ad_bc = a * d - b * c;

        if (ad_bc == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / (a * d - b * c);
            double y = (a * f - e * c) / (a * d - b * c);

            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
