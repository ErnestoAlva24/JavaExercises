import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a month: ");
        String month = input.next();
        int days = 0;

        switch (month) {
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                days = 30;
                break;
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                days = 31;
                break;
            case "Feb":
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
                    days = 29;
                else
                    days = 28;
                break;
        }

        if (days == 0)
            System.out.println(month + " is not a correct month name");
        else
            System.out.println(month + " " + year + " has " + days + " days");
    }
}
