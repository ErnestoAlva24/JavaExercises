import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        String lowestName = "";
        int lowestScore = 100;

        String secondName = "";
        int secondScore = 100;

        for (int i = 0; i < students; i++) {
            System.out.print("Enter the student's name and score: ");
            String name = input.next();
            int score = input.nextInt();

            if (score < secondScore) {
                secondScore = score;
                secondName = name;
            }

            if (secondScore < lowestScore) {
                String aux = secondName;
                secondName = lowestName;
                lowestName = aux;

                int auxScore = secondScore;
                secondScore = lowestScore;
                lowestScore = auxScore;
            }
        }

        System.out.println("The student with the lowet score is " + lowestName +
                " and the score is " + lowestScore);
        System.out.println("The student with the second-lowet score is " + secondName +
                " and the score is " + secondScore);
    }
}
