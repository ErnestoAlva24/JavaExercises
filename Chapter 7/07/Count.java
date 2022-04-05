import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < 200; i++) {
            int number = (int) (Math.random() * 9) + 1;

            count[number]++;
        }

        for (int i = 0; i <= 9; i++) {
            if (count[i] == 1)
                System.out.println(i + " occurs " + count[i] + " time");
            else if (count[i] > 1)
                System.out.println(i + " occurs " + count[i] + " times");
            else
                System.out.println(i + " occurs " + count[i] + " times");
        }
    }
}
