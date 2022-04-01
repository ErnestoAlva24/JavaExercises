public class Days {
    public static void main(String[] args) {
        for (int i = 2014; i <= 2034; i++)
            System.out.println(i + " has " + numberOfDaysInAYear(i) + " days");
    }

    public static int numberOfDaysInAYear(int year) {
        if ((year % 400 == 0)
                || ((year % 4 == 0) && (year % 100 != 0)))
            return 366;
        else
            return 365;
    }
}
