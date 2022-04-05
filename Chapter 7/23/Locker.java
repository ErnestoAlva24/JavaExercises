import java.util.Arrays;

public class Locker {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        Arrays.fill(lockers, false);

        for (int i = 0; i < 100; i++) {
            for (int j = i; j < 100; j = j + (i + 1)) {
                lockers[j] = !lockers[j];
            }
        }

        for (int i = 0; i < 100; i++)
            if (lockers[i])
                System.out.print((i + 1) + " ");

        System.out.println();
    }
}
