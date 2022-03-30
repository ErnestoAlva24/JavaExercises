import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter te first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter te second number: ");
        int n2 = input.nextInt();

        System.out.print("Enter te third number: ");
        int n3 = input.nextInt();

        if (n1 > n2) {
            n1 = n1 + n2;
            n2 = n1 - n2;
            n1 = n1 - n2;
        }
        if (n1 > n3) {
            n1 = n1 + n3;
            n3 = n1 - n3;
            n1 = n1 - n3;
        }
        if (n2 > n3) {
            n2 = n2 + n3;
            n3 = n2 - n3;
            n2 = n2 - n3;
        }

        System.out.println(n1 + ", " + n2 + ", " + n3);
    }
}
