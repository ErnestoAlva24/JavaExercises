import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] eqn = new double[3];
        double[] roots = new double[2];

        System.out.print("Enter a, b, c: ");
        eqn[0] = input.nextDouble();
        eqn[1] = input.nextDouble();
        eqn[2] = input.nextDouble();

        int realRoots = solveQuadratic(eqn, roots);

        if (realRoots == 2)
            System.out.println("The equation has two roots " + roots[0] + " and " + roots[1]);
        else if (realRoots == 1)
            System.out.println("The equation has one root " + roots[0]);
        else
            System.out.println("The equation has no real roots");
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double discriminant = Math.pow(eqn[1], 2) - 4 * eqn[0] * eqn[2];

        if (discriminant > 0) {
            roots[0] = (-eqn[1] + Math.pow(discriminant, 0.5)) / 2 * eqn[0];
            roots[1] = (-eqn[1] - Math.pow(discriminant, 0.5)) / 2 * eqn[0];

            return 2;
        } else if (discriminant == 0) {
            roots[0] = -eqn[1] / 2 * eqn[0];

            return 1;
        } else {
            return 0;
        }
    }
}
