package ATM;

class BalanceInquiry extends Transaction {
    public BalanceInquiry() {
        super(0);
    }

    @Override
    public void execute(Account account) {
        System.out.println("Balance: " + account.getBalance());
    }
}