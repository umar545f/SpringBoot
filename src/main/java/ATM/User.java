package ATM;

class User {
    private String name;
    private Card card;
    private Account account;

    public User(String name, Card card, Account account) {
        this.name = name;
        this.card = card;
        this.account = account;
    }
}
