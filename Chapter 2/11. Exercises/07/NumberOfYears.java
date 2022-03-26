import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        final int minutesInDay = 60 * 24;
        final int minutesInYear = 365 * minutesInDay;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int totalMinutes = input.nextInt();

        int NumberOfYears = totalMinutes / minutesInYear;
        int remainingMinutes = totalMinutes % minutesInYear;
        int numberOfDays = remainingMinutes / minutesInDay;

        System.out.println(totalMinutes + " minutes is aproximately " + NumberOfYears +
                " years and " + numberOfDays + " days");
    }
}
