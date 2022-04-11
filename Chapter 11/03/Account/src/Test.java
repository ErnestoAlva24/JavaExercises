public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        SavingAccount savingAccount = new SavingAccount(1122, 20000);
        ChekingAccount chekingAccount = new ChekingAccount(1122, 20000, 100);

        System.out.println(account);
        System.out.println(savingAccount);
        System.out.println(chekingAccount);
    }
}
