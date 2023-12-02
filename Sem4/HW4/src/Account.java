public abstract class Account {

    protected int balance;


    public Account(int balance) {
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public abstract void printBalance();
}
