import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        long millis = input.nextLong();

        System.out.println(convertMillis(millis));
    }

    public static String convertMillis(long millis) {
        long seconds = millis / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        seconds = seconds % 60;
        minutes = minutes % 60;

        return hours + ":" + minutes + ":" + seconds;
    }
}
