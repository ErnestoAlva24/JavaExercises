import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String line = input.nextLine().toUpperCase();

        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetter(line.charAt(i)))
                System.out.print(getNumber(line.charAt(i)));
            else
                System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    public static int getNumber(char uppercaseLetter) {
        int letter = uppercaseLetter;

        if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
            int number = (letter - 65) / 3 + 2;

            if (letter == 83 || letter == 86 || letter == 89 || letter == 90)
                number--;

            return number;
        }

        return -1;
    }
}
