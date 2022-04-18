import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Rational implements Comparable<Rational> {
    // Data fields for numerator and denominator
    private BigInteger numerator;
    private BigInteger denominator;

    /** Construct a rational with default properties */
    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    /** Construct a rational with specified numerator and denominator */
    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        this.numerator = (numerator.compareTo(BigInteger.ZERO) > 0 ?BigInteger.ONE:new BigInteger("-1"))
                .multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    /** Find GCD of two numbers */
    private static BigInteger gcd(BigInteger n, BigInteger d) {
        BigInteger n1 = n.abs();
        BigInteger n2 = d.abs();
        BigInteger gcd = BigInteger.ONE;

        for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0 && k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
            if (n1.remainder(k).compareTo(BigInteger.ZERO) == 0 && n2.remainder(k).compareTo(BigInteger.ZERO) == 0)
                gcd = k;
        }

        return gcd;
    }

    /** Return numerator */
    public BigInteger getNumerator() {
        return numerator;
    }

    /** Return denominator */
    public BigInteger getDenominator() {
        return denominator;
    }

    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).
                add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational(n, d);
    }

    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational(n, d);
    }

    /** Multiply a rational number by this rational */
    public Rational multiply(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());

        return new Rational(n, d);
    }

    /** Divide a rational number by this rational */
    public Rational divide(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.numerator);

        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.compareTo(BigInteger.ONE) == 0)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        return (this.subtract((Rational) (other))).getNumerator().compareTo(BigInteger.ZERO) == 0;
    }

    public BigDecimal doubleValue() {
        return new BigDecimal(numerator.toString()).divide(new BigDecimal(denominator.toString()), RoundingMode.HALF_UP);
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(Rational o) {
        return Integer.compare(this.subtract(o).getNumerator().compareTo(BigInteger.ZERO), 0);
    }
}