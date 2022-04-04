public class Mersenne {
    public static void main(String[] args) {
        System.out.println("p       2^p - 1");
        System.out.println("---------------");

        for (int i = 2; i <= 31; i++) {
            if (isPrime((int) Math.pow(2, i) - 1))
                System.out.println(i + "       " + (int) (Math.pow(2, i) - 1));
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0)
                return false;

        return true;
    }
}
