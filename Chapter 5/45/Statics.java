import java.util.Scanner;

public class Statics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");

        double sum = 0;
        double sumPow = 0;

        for (int i = 0; i < 10; i++) {
            double number = input.nextDouble();

            sum += number;
            sumPow += Math.pow(number, 2);
        }

        double mean = sum / 10;
        double deviation = Math.sqrt((sumPow - Math.pow(sum, 2) / 10) / 9);

        System.out.println("The mean is " + mean);
        System.out.println("The standar deviation is " + deviation);
    }
}
