public class Twin {
    public static void main(String[] args) {
        for (int i = 2; i < 1200; i++) {
            if (isPrime(i) && isPrime(i + 2))
                System.out.println("(" + i + ", " + (i + 2) + ")");
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0)
                return false;

        return true;
    }
}
