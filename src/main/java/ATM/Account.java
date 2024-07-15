package ATM;

class Account {
    private String accountNumber;
    private double balance;
    private double dailyLimit;

    public Account(String accountNumber, double balance, double dailyLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dailyLimit = dailyLimit;
    }

    public void debit(double amount) {
        balance -= amount;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
