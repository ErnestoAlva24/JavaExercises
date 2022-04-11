public class Calculator {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(1);
        }

        // The result of the operation
        int result = 0;

        int n1 = 0, n2 = 0;

        try {
            n1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input " + args[0]);
            System.exit(1);
        }
        try {
            n2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException ex) {
            System.out.println("Wrong input " + args[2]);
            System.exit(1);
        }

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '.':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
}
