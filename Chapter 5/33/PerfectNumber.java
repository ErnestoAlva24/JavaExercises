public class PerfectNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            int sum = 0;
            boolean band = false;

            for (int j = 1; j < i / 2 + 1; j++) {
                band = true;
                if (i % j == 0)
                    sum += j;
            }

            if (band && sum == i)
                System.out.println(i);
        }
    }
}
