import java.util.Scanner;

import javax.lang.model.element.Element;

public class FutureDates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int day = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();

        String todayDay = "", futureDay = "";

        switch (day) {
            case 0:
                todayDay = "Sunday";
                break;
            case 1:
                todayDay = "Monday";
                break;
            case 2:
                todayDay = "Tuesday";
                break;
            case 3:
                todayDay = "Wednesday";
                break;
            case 4:
                todayDay = "Thursday";
                break;
            case 5:
                todayDay = "Friday";
                break;
            case 6:
                todayDay = "Saturday";
                break;
        }

        day = day + daysElapsed;
        day = day % 7;

        switch (day) {
            case 0:
                futureDay = "Sunday";
                break;
            case 1:
                futureDay = "Monday";
                break;
            case 2:
                futureDay = "Tuesday";
                break;
            case 3:
                futureDay = "Wednesday";
                break;
            case 4:
                futureDay = "Thursday";
                break;
            case 5:
                futureDay = "Friday";
                break;
            case 6:
                futureDay = "Saturday";
                break;
        }

        System.out.println("Today is " + todayDay + " and the future day is " + futureDay);
    }
}
