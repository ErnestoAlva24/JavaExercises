import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");

        int answer = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();

            list.add(answer);

            for (int i = 0; i < list.size(); i++)
                if (list.get(i) == answer) {
                    System.out.println("You already entered " + answer);
                    break;
                }
        }

        System.out.println("You got it!");
    }
}
