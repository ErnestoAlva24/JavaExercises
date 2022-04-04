import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();
        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the polygon is " + area(sides, side));
    }

    public static double area(int n, double side) {
        double area = n * Math.pow(n, 2) / (4 * Math.tan(Math.PI / n));

        return area;
    }
}
