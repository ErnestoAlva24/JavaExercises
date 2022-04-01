import java.util.Scanner;

public class Prefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        String prefix = "";
        int index = 0;

        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                prefix += str1.charAt(index);
                index++;
            } else
                break;
        }

        if (prefix.equals(""))
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        else
            System.out.println("The common prefix is " + prefix);
    }
}
