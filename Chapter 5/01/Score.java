import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;

        do {
            System.out.print("Enter your score: ");
            score = input.nextInt();

            if (score >= 60)
                System.out.println("You pass the exam.");
            else if (score > -1)
                System.out.println("You don't pass the exam.");
        } while (score != -1);

        System.out.println("No numbers are entered except 0");
    }
}
