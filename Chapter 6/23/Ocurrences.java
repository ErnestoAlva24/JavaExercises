import java.util.Scanner;

public class Ocurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter a character: ");
        char c = scanner.next().charAt(0);

        System.out.println(count(str, c));
    }

    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == a)
                count++;

        return count;
    }
}
