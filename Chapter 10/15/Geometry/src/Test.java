import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter five points: ");
        double[][] points = new double[5][2];

        for(int i = 0; i < 5; i++){
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        MyRectangle2D r = MyRectangle2D.getRectangle(points);

        System.out.println("The bounding rectangle's center (" + r.getX() + ", " + r.getY() +
                "), width " + r.getWidth() + ", height " + r.getHeight());
    }
}
