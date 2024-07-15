package ATM;

import java.util.HashMap;
import java.util.Map;

class Bank {
    private String name;
    private String branch;
    private Map<String, String> cardToPinMap;
    private Map<String, Account> cardToAccountMap;

    public Bank(String name, String branch) {
        this.name = name;
        this.branch = branch;
        this.cardToPinMap = new HashMap<>();
        this.cardToAccountMap = new HashMap<>();
    }

    public void addCard(String cardNumber, String pin, Account account) {
        cardToPinMap.put(cardNumber, pin);
        cardToAccountMap.put(cardNumber, account);
    }

    public boolean verifyCard(String cardNumber, String pin) {
        String storedPin = cardToPinMap.get(cardNumber);
        return storedPin != null && storedPin.equals(pin);
    }

    public Account getAccount(String cardNumber) {
        return cardToAccountMap.get(cardNumber);
    }
}
