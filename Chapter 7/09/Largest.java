import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++)
            array[i] = input.nextDouble();

        double max = max(array);

        System.out.println("The max number is " + max);
    }

    public static double max(double[] array) {
        double max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
}
