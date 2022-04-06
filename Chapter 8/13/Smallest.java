import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns of the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] matrix = new double[rows][cols];

        System.out.println("Enter the array: ");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = input.nextDouble();

        int[] location = locateSmallest(matrix);

        System.out.print("The location of the smallest element is at (" + location[0] + ", " + location[1] + ")");
    }

    public static int[] locateSmallest(double[][] a) {
        int[] location = { 0, 0 };

        double smallest = Double.POSITIVE_INFINITY;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < smallest) {
                    smallest = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }
}
