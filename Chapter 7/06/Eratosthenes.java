import java.util.Arrays;

public class Eratosthenes {
    public static void main(String[] args) {
        boolean[] flags = new boolean[51];

        Arrays.fill(flags, true);

        for (int i = 2; i <= 50; i++) {
            if (!flags[i])
                continue;

            for (int j = 2; j < i / 2 + 1; j++) {
                if (i / j == 0)
                    flags[i] = false;
            }

            if (!flags[i]) {
                int n = i * 2;

                while (n <= 50) {
                    flags[n] = false;
                    n += i;
                }
            }
        }

        for (int i = 2; i <= 50; i++) {
            if (flags[i])
                System.out.println(i);
        }
    }
}
