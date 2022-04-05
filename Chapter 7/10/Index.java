import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++)
            array[i] = input.nextDouble();

        int index = indexOfLargestElement(array);

        System.out.println("The index of largest number is " + index);
    }

    public static int indexOfLargestElement(double[] array) {
        int index = 0;
        double largest = 0;

        for (int i = 0; i < array.length; i++)
            if (array[i] >= largest) {
                index = i;
                largest = array[i];
            }

        return index;
    }
}
