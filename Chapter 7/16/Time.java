public class Time {
    public static void main(String[] args) {
        int[] list = new int[100000000];

        for (int i = 0; i < 100000000; i++)
            list[i] = i + 1;

        System.out.println("Lineaer Search");
        long startTime = System.nanoTime();

        linearSearch(list, 1);

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Number: 1, Time: " + executionTime);

        startTime = System.nanoTime();
        linearSearch(list, 25000000);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 25000000, Time: " + executionTime);

        startTime = System.nanoTime();
        linearSearch(list, 50000000);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 50000000, Time: " + executionTime);

        startTime = System.nanoTime();
        linearSearch(list, 75000000);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 75000000, Time: " + executionTime);

        startTime = System.nanoTime();
        linearSearch(list, 100000000);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 100000000, Time: " + executionTime);

        System.out.println("Binary Search");

        startTime = System.nanoTime();
        binarySearch(list, 1);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 1, Time: " + executionTime);

        startTime = System.nanoTime();
        binarySearch(list, 25000000);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 25000000, Time: " + executionTime);

        startTime = System.nanoTime();
        binarySearch(list, 50000000);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 50000000, Time: " + executionTime);

        startTime = System.nanoTime();
        binarySearch(list, 75000000);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 75000000, Time: " + executionTime);

        startTime = System.nanoTime();
        binarySearch(list, 100000000);
        endTime = System.nanoTime();
        executionTime = endTime - startTime;
        System.out.println("Number: 100000000, Time: " + executionTime);
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low, key not found
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
