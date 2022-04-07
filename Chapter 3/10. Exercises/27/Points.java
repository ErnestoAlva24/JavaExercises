import java.util.Scanner;

public class Points {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double intersectX = (-x * (200 * 100)) / (-y * 200 - x * 100);
        double intersectY = (-y * (200 * 100)) / (-y * 200 - x * 100);

        if (x > intersectX || y > intersectY)
            System.out.println("The point is not in the triangle");
        else
            System.out.println("The point is in the triangle");

    }
}
