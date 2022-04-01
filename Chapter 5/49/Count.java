import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int vowels = 0;
        int consonants = 0;

        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                vowels++;
            else if (Character.isLetter(c))
                consonants++;
        }

        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    }
}
