public class PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 1200;
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count = 0;
        int number = 2;

        // Repeatedly find prime numbers
        while (number <= NUMBER_OF_PRIMES) {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?

            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count

                if (count == NUMBER_OF_PRIMES_PER_LINE) {
                    // Display the number and advance to the new line
                    System.out.println(number);
                    count = 0;
                } else
                    System.out.print(number + " ");
            }

            // Check if the next number is prime
            number++;
        }
    }
}
