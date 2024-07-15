package ATM;

import java.util.Date;

class Card {
    private String cardNumber;
    private Date expiryDate;
    private Bank bank;

    public Card(String cardNumber, Date expiryDate, Bank bank) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Bank getBank() {
        return bank;
    }
}
