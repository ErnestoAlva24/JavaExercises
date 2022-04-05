import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter ten double numbers: ");

        for (int i = 0; i < 10; i++)
            array[i] = input.nextDouble();

        double avg = average(array);

        System.out.println("The average is " + avg);
    }

    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++)
            sum += array[i];

        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;

        for (int i = 0; i < array.length; i++)
            sum += array[i];

        return sum / array.length;
    }
}
