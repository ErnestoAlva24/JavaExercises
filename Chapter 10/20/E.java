import java.math.BigDecimal;

public class E {
    public static void main(String[] args) {
        for (BigDecimal i = new BigDecimal("100"); i.compareTo(new BigDecimal("1000")) <= 0; i = i
                .add(new BigDecimal("100"))) {
            BigDecimal e = new BigDecimal("0.0");
            BigDecimal one = new BigDecimal("1");

            for (BigDecimal j = one; j.compareTo(i) <= 0; j = j.add(one)) {
                BigDecimal denominator = j;
                for (BigDecimal k = j.subtract(one); k.compareTo(one) >= 1; k = k.subtract(one)) {
                    denominator = denominator.multiply(k);
                }
                e = e.add(one.divide(denominator, 25, BigDecimal.ROUND_UP));
            }
            System.out.println(i + "      " + e);
        }
    }
}
