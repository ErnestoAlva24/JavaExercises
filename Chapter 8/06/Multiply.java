import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");
        double[][] a = new double[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = input.nextDouble();

        System.out.print("Enter matrix2: ");
        double[][] b = new double[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = input.nextDouble();

        double[][] mul = multiplyMatrix(a, b);

        System.out.println("The multiplication of the matrices is");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");

            if (i == 1)
                System.out.print(" *  ");
            else
                System.out.print("    ");

            for (int j = 0; j < 3; j++)
                System.out.print(b[i][j] + " ");

            if (i == 1)
                System.out.print(" =  ");
            else
                System.out.print("    ");

            for (int j = 0; j < 3; j++)
                System.out.print(mul[i][j] + " ");

            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] mul = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                mul[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
        }

        return mul;
    }
}
