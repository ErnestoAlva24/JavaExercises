import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int sides = input.nextInt();

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = sides * Math.pow(side, 2) / (4 * Math.tan(Math.PI / sides));

        System.out.println("The area of the polygon is " + area);
    }
}
