import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int n = input.nextInt();
        int best = 0;

        int[] grades = new int[4];

        System.out.print("Enter " + n + " scores: ");

        for (int i = 0; i < n; i++) {
            grades[i] = input.nextInt();

            if (grades[i] > best)
                best = grades[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Student " + n + " score is " + grades[i] + " and grade  is ");

            if (grades[i] >= best - 5)
                System.out.println("A");
            else if (grades[i] >= best - 10)
                System.out.println("B");
            else if (grades[i] >= best - 15)
                System.out.println("C");
            else if (grades[i] >= best - 20)
                System.out.println("D");
            else
                System.out.println("F");
        }
    }
}
