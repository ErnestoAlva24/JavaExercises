import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[100000];

        Random rand = new Random();

        for(int i = 0; i<arr.length;i++)
            arr[i] = rand.nextInt();

        StopWatch watch = new StopWatch();

        watch.start();
        sort(arr);
        watch.stop();

        System.out.println("Time: " + watch.getElapsedTime());
    }

    public static void sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
