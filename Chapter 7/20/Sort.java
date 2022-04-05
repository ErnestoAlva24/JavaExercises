import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++)
            array[i] = input.nextDouble();

        bubbleSort(array);

        System.out.print("Sorted numbers: ");

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void bubbleSort(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}
