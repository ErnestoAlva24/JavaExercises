public class Calculator {
    /** Main method */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        // The result of the operation
        Rational result = new Rational();
        String[] n1 = args[0].split("/");
        String[] n2 = args[2].split("/");

        Rational r1 = new Rational(Integer.parseInt(n1[0]), Integer.parseInt(n1[1]));
        Rational r2 = new Rational(Integer.parseInt(n2[0]), Integer.parseInt(n2[1]));

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = r1.add(r2);
                break;
            case '-':
                result = r1.subtract(r2);
                break;
            case '*':
                result = r1.multiply(r2);
                break;
            case '/':
                result = r1.divide(r2);
        }

        // Display result
        System.out.println(r1 + " " + args[1] + " " + r2 + " = " + result);
    }
}