import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++)
            array[i] = input.nextInt();

        System.out.println(array[getRandom(array)]);
    }

    public static int getRandom(int... numbers) {
        int index = (int) (Math.random() * numbers.length);

        return numbers[index];
    }
}
