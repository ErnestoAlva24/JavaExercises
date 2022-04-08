import java.math.BigInteger;

public class Divisible {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger rem = new BigInteger("0");

        int count = 0;

        while (count < 10) {
            if (rem.compareTo(num.remainder(new BigInteger("2"))) == 0 ||
                    rem.compareTo(num.remainder(new BigInteger("3"))) == 0) {
                System.out.println(num);
                count++;
            }
            num = num.add(new BigInteger("1"));
        }
    }
}
