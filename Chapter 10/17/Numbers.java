import java.math.BigInteger;

public class Numbers {
    public static void main(String[] args) {
        BigInteger i = new BigInteger(Long.MAX_VALUE + "");
        BigInteger limit = i.add(new BigInteger("10"));

        for (i = new BigInteger(Long.MAX_VALUE + ""); i.compareTo(limit) <= 0; i = i.add(new BigInteger("1"))) {
            System.out.println(i.multiply(i));
        }
    }
}
