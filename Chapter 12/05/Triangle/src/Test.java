import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the triangle sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        input.nextLine();

        Triangle t = null;

        try {
            t = new Triangle(side1, side2, side3);
        } catch (IllegalTriangleException e) {
            System.out.println("Invalid sides");
            System.exit(1);
        }

        System.out.print("Enter the color: ");
        String color = input.nextLine();
        t.setColor(color);

        System.out.print("The triangle is filled (Y/N): ");
        char c = input.nextLine().charAt(0);
        t.setFilled(c == 'Y');

        System.out.println("Triangle area is " + t.getArea());
        System.out.println("Triangle perimeter is " + t.getPerimeter());
        System.out.println("Triangle color is " + t.getColor());
        System.out.println("Triangle is " + (t.isFilled()? "":"not ") + "filled");
    }
}
