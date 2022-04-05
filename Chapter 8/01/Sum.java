import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = input.nextDouble();

        for (int i = 0; i < 3; i++)
            System.out.println("Sum of the elements at row " + i + " is " + sumRow(matrix, i));
    }

    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;

        for (int i = 0; i < m[rowIndex].length; i++)
            sum += m[rowIndex][i];

        return sum;
    }
}
