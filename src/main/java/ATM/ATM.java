package ATM;

class ATM {
    private ReceiptPrinter receiptPrinter;
    private Bank bank;
    private Account currentAccount;

    public ATM(Bank bank) {
        this.bank = bank;
        this.receiptPrinter = new ReceiptPrinter();
    }

    public boolean authenticate(Card card, String pin) {
        if (bank.verifyCard(card.getCardNumber(), pin)) {
            currentAccount = bank.getAccount(card.getCardNumber());
            System.out.println("Authentication successful");
            return true;
        } else {
            System.out.println("Authentication failed");
            return false;
        }
    }


    public void processTxn(Transaction transaction) {
        if (currentAccount != null) {
            transaction.execute(currentAccount);
            showReceipt(transaction);
        } else {
            System.out.println("No authenticated account. Please authenticate first.");
        }
    }

    public void showReceipt(Transaction transaction) {
        receiptPrinter.printReceipt(transaction);
    }
}
