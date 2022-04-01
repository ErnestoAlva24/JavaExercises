public class PI {
    public static void main(String[] args) {
        double pi = 0;
        int i = 1;

        while (i <= 10000) {
            pi += Math.pow(-1, i + 1) / ((double) 2 * i - 1);
            i++;
        }

        System.out.println("i = 10000: " + (4 * pi));

        while (i <= 20000) {
            pi += Math.pow(-1, i + 1) / ((double) 2 * i - 1);
            i++;
        }

        System.out.println("i = 20000: " + (4 * pi));

        while (i <= 100000) {
            pi += Math.pow(-1, i + 1) / ((double) 2 * i - 1);
            i++;
        }

        System.out.println("i = 100000: " + (4 * pi));
    }
}
