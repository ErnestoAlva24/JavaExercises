import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        String letterGrade = input.nextLine();

        char letter = letterGrade.charAt(0);

        if (letter == 'A' || letter == 'B' || letter == 'C' || letter == 'D' || letter == 'F') {
            int number = 4 - (letter - 65);

            if (letter == 'F')
                number++;

            System.out.println("The numeric value for grade " + letter + " is " + number);
        } else
            System.out.println(letter + " is an invalid grade");

    }
}
