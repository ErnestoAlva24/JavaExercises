import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first rational number: ");
        BigInteger n1 = input.nextBigInteger();
        BigInteger n2 = input.nextBigInteger();

        Rational r1 = new Rational(n1, n2);

        System.out.print("Enter the second rational number: ");
        n1 = input.nextBigInteger();
        n2 = input.nextBigInteger();

        Rational r2 = new Rational(n1, n2);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2).toString());
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2).toString());
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2).toString());
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2).toString());
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
