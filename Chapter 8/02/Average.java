import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = input.nextDouble();

        System.out.println("Average of the major diagonal is " + averageMajorDiagonal(matrix));
    }

    public static double averageMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < 4; i++)
            sum += m[i][i];

        return sum / 4;
    }
}
