import java.util.Scanner;

public class Normalizing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int largest = 0;

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();

            if (array[i] > largest)
                largest = array[i];
        }

        double[] normilized = new double[10];

        for (int i = 0; i < 10; i++)
            normilized[i] = array[i] / (float) largest;

        System.out.print("Normalized list: ");

        for (int i = 0; i < 10; i++)
            System.out.print(normilized[i] + " ");
    }
}
