public class Series {
    public static void main(String[] args) {
        System.out.println("I         m(i)");
        System.out.println("----------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "         " + m(i));
        }
    }

    public static double m(int limit) {
        double sum = 0;

        for (int i = 1; i <= limit; i++)
            sum += i / i + 2.0;

        return sum;
    }
}
