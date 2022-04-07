import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];

        int initialBalance = 100;
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, initialBalance);
        }

        do {
            System.out.print("Enter an id: ");
            int id = input.nextInt();

            if (isValidID(id, accounts)) {
                int choice;
                do {
                    System.out.print("" +
                            "\nMain menu" +
                            "\n1: Check balance" +
                            "\n2: Withdraw" +
                            "\n3: Deposit" +
                            "\n4: exit" +
                            "\nEnter a choice: ");

                    choice = input.nextInt();

                    if (choice > 0 && choice < 4) {
                        executeTransaction(choice, accounts, id, input);
                    }
                } while (choice != 4);
            }
        } while (true);
    }

    public static boolean isValidID(int id, Account[] a) {
        for (Account account : a) {
            if (id == account.getId())
                return true;
        }
        return false;
    }

    public static void executeTransaction(int c, Account[] a, int id, Scanner input) {
        switch (c) {
            case 1:
                System.out.println("The balance is " + a[id].getBalance());
                break;
            case 2:
                System.out.print("Enter an amount to withdraw: ");
                a[id].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.print("Enter an amount to deposit: ");
                a[id].deposit(input.nextDouble());
        }
    }
}
