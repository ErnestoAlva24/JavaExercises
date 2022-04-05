import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.next();

        System.out.println("Sorted string: " + sort(s));
    }

    public static String sort(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }

        String sorted = "";

        for (int i = 0; i < n; i++)
            sorted += chars[i];

        return sorted;
    }
}
