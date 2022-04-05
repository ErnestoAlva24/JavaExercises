import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        String[] names = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name and score: ");
            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    String str = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = str;
                }

        for (int i = 0; i < n; i++)
            System.out.println(names[i] + " " + scores[i]);
    }
}
