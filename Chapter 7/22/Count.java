import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char[] chars = str.toCharArray();

        int lowercase = 0, uppercase = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u')
                lowercase++;
            else if (chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U')
                uppercase++;
        }

        System.out.println("Lowercase vowels: " + lowercase);
        System.out.println("Uppercase  vowels: " + uppercase);
    }
}
