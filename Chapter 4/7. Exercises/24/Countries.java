import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first country: ");
        String c1 = input.nextLine();

        System.out.print("Enter the second country: ");
        String c2 = input.nextLine();

        System.out.print("Enter the third country: ");
        String c3 = input.nextLine();

        if (c3.length() > c2.length()) {
            String aux = c3;
            c3 = c2;
            c2 = aux;
        }
        if (c3.length() > c1.length()) {
            String aux = c3;
            c3 = c1;
            c1 = aux;
        }
        if (c2.length() > c1.length()) {
            String aux = c1;
            c1 = c2;
            c2 = aux;
        }

        System.out.println("The three countries in descending order are " + c1 + " " + c2 + " " + c3);
    }
}
