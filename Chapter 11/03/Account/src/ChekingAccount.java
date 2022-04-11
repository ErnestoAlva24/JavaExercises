public class ChekingAccount extends Account{
    public double limit;

    public ChekingAccount() {
        super();
        limit = 100;
    }

    public ChekingAccount(int id, double balance, double limit) {
        super(id, balance);
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= this.getBalance())
            super.withdraw(amount);
        else if(amount <= this.getBalance() + amount){
            amount -= getBalance();
            setBalance(0);
            limit -= amount;
        }
        else
            System.out.println("Error");
    }

    @Override
    public String toString() {
        return "ChekingAccount{" +
                "limit=" + limit +
                '}';
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
