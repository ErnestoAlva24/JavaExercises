import java.util.Scanner;

public class Point {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (Math.abs(x) <= 5 && Math.abs(y) <= 2.5)
            System.out.println("Point (" + x + ", " + y + ") is in the rectagle");
        else
            System.out.println("Point (" + x + ", " + y + ") is not in the rectagle");
    }
}
