public class Palindromic {
    public static void main(String[] args) {
        int numbers = 0;
        int count = 0;
        int number = 2;

        while (numbers < 120) {
            if (isPrime(number)) {
                if (isPalindromic(number)) {
                    System.out.print(number + " ");
                    count++;
                    numbers++;

                    if (count == 10) {
                        System.out.println();
                        count = 0;
                    }
                }
            }

            number++;
        }
    }

    public static boolean isPalindromic(int number) {
        StringBuilder str = new StringBuilder(String.valueOf(number));

        if (str.toString().equals(str.reverse().toString()))
            return true;

        return false;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++)
            if (number % i == 0)
                return false;

        return true;
    }
}
