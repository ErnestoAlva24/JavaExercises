import java.math.BigInteger;

public class Primes {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(Long.MAX_VALUE + "");

        int count = 0;

        while (count < 5) {
            num = num.add(new BigInteger("1"));

            boolean flag = true;

            for (BigInteger i = new BigInteger("2"); i.compareTo(num.divide(new BigInteger("2"))) <= 0; i = i
                    .add(new BigInteger("1")))
                if (num.remainder(i).compareTo(new BigInteger("0")) == 0) {
                    flag = false;
                    break;
                }

            if (flag) {
                count++;
                System.out.println(num);
            }
        }
    }
}
