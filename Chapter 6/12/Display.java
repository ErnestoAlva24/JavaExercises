public class Display {
    public static void main(String[] args) {
        printNumbers(1, 100, 10);
    }

    public static void printNumbers(int num1, int num2, int numberPerLine) {
        int count = 0;

        for (int i = num1; i <= num2; i++) {
            System.out.print(((char) i) + " ");
            count++;

            if (count == numberPerLine) {
                count = 0;
                System.out.println();
            }
        }
    }
}
