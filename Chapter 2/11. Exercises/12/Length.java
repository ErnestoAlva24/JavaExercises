import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextInt();
        double acceleration = input.nextDouble();

        double Length = Math.pow(speed, 2) / (2 * acceleration);

        System.out.println("The minimum runway length for this airplane is " + Length);
    }
}
