import java.util.Scanner;

import javax.swing.InputMap;

public class ProcessString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1 && str.charAt(i) != ' ')
                System.out.print(str.charAt(i));
        }

        System.out.println();
    }
}
