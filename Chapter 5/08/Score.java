import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        String highestName = "";
        int highestScore = 0;

        for (int i = 0; i < students; i++) {
            System.out.print("Enter the student's name and score: ");
            String name = input.next();
            int score = input.nextInt();

            if (score > highestScore) {
                highestScore = score;
                highestName = name;
            }
        }

        System.out.println("The student with the highest score is " + highestName +
                " and the score is " + highestScore);
    }
}
