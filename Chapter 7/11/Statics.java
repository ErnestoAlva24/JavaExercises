import java.util.Scanner;

public class Statics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++)
            array[i] = input.nextDouble();

        double mean = mean(array);
        double deviation = deviation(array);

        System.out.println("The mean is " + mean);
        System.out.println("The standar deviation is " + deviation);
    }

    public static double deviation(double[] x) {
        double mean = mean(x);
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += Math.pow(x[i] - mean, 2);
        }

        return Math.sqrt(sum / x.length - 1);
    }

    public static double mean(double[] x) {
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += x[i];
        }

        return sum / 10;
    }
}
