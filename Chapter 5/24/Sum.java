public class Sum {
    public static void main(String[] args) {
        double sum = 0;
        int num = 1;
        int den = 3;

        while (den < 100) {
            sum += num / ((double) den);

            num += 2;
            den += 2;
        }

        System.out.println(sum);
    }
}
