package ATM;

class Deposit extends Transaction {
    public Deposit(double amount) {
        super(amount);
    }

    @Override
    public void execute(Account account) {
        account.credit(amount);
        System.out.println("Depositing " + amount);
    }
}