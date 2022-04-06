import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter matrix1: ");
        double[][] a = new double[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = input.nextDouble();

        System.out.print("Enter matrix2: ");
        double[][] b = new double[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = input.nextDouble();

        double[][] sum = addMatrix(a, b);

        System.out.println("The matrices are added as follows");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(a[i][j] + " ");

            if (i == 1)
                System.out.print(" +  ");
            else
                System.out.print("    ");

            for (int j = 0; j < 2; j++)
                System.out.print(b[i][j] + " ");

            if (i == 1)
                System.out.print(" =  ");
            else
                System.out.print("    ");

            for (int j = 0; j < 2; j++)
                System.out.print(sum[i][j] + " ");

            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] sum = new double[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                sum[i][j] = a[i][j] + b[i][j];
        }

        return sum;
    }
}
