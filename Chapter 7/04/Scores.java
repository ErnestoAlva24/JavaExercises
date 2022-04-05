import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] scores = new int[100];
        int n = 0;
        int score = 0;

        while (score >= 0) {
            score = scanner.nextInt();
            scores[n] = score;
            n++;
        }

        n--;

        int sum = 0;

        for (int i = 0; i < n; i++)
            sum += scores[i];

        double avg = sum / (double) n;

        int above = 0, below = 0;

        for (int i = 0; i < n; i++) {
            if (scores[i] >= avg)
                above++;
            else
                below++;
        }

        System.out.println("There are " + above + " scores above or equal to the average");
        System.out.println("There are " + below + " scores below the average");
    }
}
