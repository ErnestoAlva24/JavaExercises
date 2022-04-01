public class Pi {
    public static void main(String[] args) {
        System.out.println("i         m(i)");
        System.out.println("----------------------------");

        for (int i = 1; i <= 901; i += 100) {
            System.out.println(i + "         " + m(i));
        }
    }

    public static double m(int limit) {
        double sum = 0;

        for (int i = 1; i <= limit; i++)
            sum += Math.pow(-1, i + 1) / ((double) 2 * i - 1);

        return 4 * sum;
    }
}
