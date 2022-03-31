import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String line = input.nextLine();

        int letter = line.toUpperCase().charAt(0);

        if ((letter >= 65 && letter <= 80) || (letter >= 97 && letter <= 122)) {
            int number = (letter - 65) / 3 + 2;

            if (letter == 83 || letter == 86 || letter == 89 || letter == 90)
                number--;

            System.out.println("The corresponding number is " + number);
        } else
            System.out.println(line + " is an invalid input");
    }
}
