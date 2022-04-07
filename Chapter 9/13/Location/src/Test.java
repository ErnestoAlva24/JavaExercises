import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double [][] a = new double[rows][cols];

        for(int i = 0; i<rows;i++)
            for(int j = 0; j< cols;j++)
                a[i][j] = input.nextDouble();

        Location location = Location.locateLargest(a);

        System.out.println("The location of the largest element is " + location.maxValue +
                " at (" + location.row + ", " + location.column + ")");
    }
}
