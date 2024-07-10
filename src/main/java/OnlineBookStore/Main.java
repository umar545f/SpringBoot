package OnlineBookStore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create categories
        Category fiction = new Category("1", "Fiction");
        Category nonFiction = new Category("2", "Non-Fiction");

        // Create books
        Book book1 = new Book("978-3-16-148410-0", "The Great Gatsby", "F. Scott Fitzgerald", 10.99, fiction, 100);
        Book book2 = new Book("978-1-56619-909-4", "Sapiens", "Yuval Noah Harari", 15.99, nonFiction, 50);

        // Create inventory
        Map<Book, Integer> stock = new HashMap<>();
        stock.put(book1, 100);
        stock.put(book2, 50);
        Inventory inventory = new Inventory(stock);

        // Create users
        User user1 = new User("1", "Alice", "alice@example.com", "password123", "123 Main St");
        User user2 = new User("2", "Bob", "bob@example.com", "password456", "456 Elm St");

        // Create cart
        Cart cart1 = new Cart(user1, Arrays.asList(book1, book2));

        // Create order
        Order order1 = new Order("1", user1, Arrays.asList(book1, book2), cart1.getTotalPrice(), new Date(), "Pending");

        // Create payment
        Payment payment1 = new Payment("1", order1, cart1.getTotalPrice(), new Date(), "Credit Card");

        // Create review
        Review review1 = new Review("1", user1, book1, 5, "Amazing book!");

        // Display order details
        System.out.println("Order ID: " + order1.getOrderId());
        System.out.println("User: " + order1.getUser().getName());
        System.out.println("Books: ");
        for (Book book : order1.getBooks()) {
            System.out.println(" - " + book.getTitle() + " by " + book.getAuthor());
        }
        System.out.println("Total Amount: $" + order1.getTotalAmount());
        System.out.println("Order Date: " + order1.getOrderDate());
        System.out.println("Order Status: " + order1.getStatus());
    }
}
