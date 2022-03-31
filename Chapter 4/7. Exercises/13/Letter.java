import java.util.Scanner;

public class Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String line = input.nextLine();

        char letter = line.charAt(0);
        char aux = line.toLowerCase().charAt(0);

        if (Character.isAlphabetic(letter)) {
            if (aux == 'a' || aux == 'e' || aux == 'i' || aux == 'o' || aux == 'u')
                System.out.println(letter + " is a vowel");
            else
                System.out.println(letter + " is a consonant");
        } else
            System.out.println(letter + " is an invalid input");
    }
}
