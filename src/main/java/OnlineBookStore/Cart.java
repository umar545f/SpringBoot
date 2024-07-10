package OnlineBookStore;

import java.util.List;

public class Cart {
    private User user;
    private List<Book> books;
    private double totalPrice;

    public Cart(User user, List<Book> books) {
        this.user = user;
        this.books = books;
        this.totalPrice = calculateTotalPrice();
    }

    private double calculateTotalPrice() {
        return books.stream().mapToDouble(Book::getPrice).sum();
    }

    // Getters and Setters

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
