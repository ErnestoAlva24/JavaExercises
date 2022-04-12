public class Test {
    public static void main(String[] args) {
        try {
            Fraction fraction = new Fraction(1, 0);
        } catch (NullDenominatorException e) {
            System.out.println("Invalid denominator");
        }
    }
}
