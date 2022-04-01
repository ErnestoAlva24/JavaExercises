import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int i = lines; i > 0; i--) {
            int num = i;

            while (num > 0) {
                System.out.print(num + " ");
                num--;
            }

            num += 2;

            while (num <= i) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
