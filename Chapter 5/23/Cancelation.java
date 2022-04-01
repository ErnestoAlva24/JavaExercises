public class Cancelation {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 50000; i++)
            sum += 1.0 / i;

        System.out.println(sum);

        sum = 0;

        for (int i = 50000; i > 0; i--)
            sum += 1.0 / i;

        System.out.println(sum);
    }
}
