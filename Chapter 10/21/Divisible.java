import java.math.BigInteger;

public class Divisible {
    public static void main(String[] args) {
        BigInteger num = new BigInteger(Long.MAX_VALUE + "");
        BigInteger rem = new BigInteger("0");

        int count = 0;

        while (count < 10) {
            if (rem.compareTo(num.remainder(new BigInteger("5"))) == 0 ||
                    rem.compareTo(num.remainder(new BigInteger("6"))) == 0) {
                System.out.println(num);
                count++;
            }
            num = num.add(new BigInteger("1"));
        }
    }
}
