import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.next();

        if (isValid(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    public static boolean isValid(String password) {
        int digits = 0;

        if (password.length() < 10)
            return false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (!Character.isLetterOrDigit(c))
                return false;

            if (Character.isDigit(c))
                digits++;
        }

        return digits >= 3;
    }
}
