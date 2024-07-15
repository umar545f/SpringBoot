package ATM;

class Withdrawal extends Transaction {
    public Withdrawal(double amount) {
        super(amount);
    }

    @Override
    public void execute(Account account) {
        if (account.getBalance() >= amount) {
            account.debit(amount);
            System.out.println("Withdrawing " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}