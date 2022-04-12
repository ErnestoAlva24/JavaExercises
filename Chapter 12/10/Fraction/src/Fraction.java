public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) throws NullDenominatorException {
        if(denominator == 0)
            throw new NullDenominatorException();

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
