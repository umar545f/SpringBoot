package ATM;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("XYZ Bank", "Main Branch");
        
        Account johnAccount = new Account("123456", 1000, 500);
        Card johnCard = new Card("1234-5678-9876-5432", new Date(), bank);
        bank.addCard(johnCard.getCardNumber(), "1234", johnAccount);

        ATM atm = new ATM(bank);
        
        if (atm.authenticate(johnCard, "1234")) {
            Transaction withdrawal = new Withdrawal(200);
            atm.processTxn(withdrawal);

            Transaction deposit = new Deposit(300);
            atm.processTxn(deposit);

            Transaction balanceInquiry = new BalanceInquiry();
            atm.processTxn(balanceInquiry);
        } else {
            System.out.println("Authentication failed. Transaction aborted.");
        }
    }
}
