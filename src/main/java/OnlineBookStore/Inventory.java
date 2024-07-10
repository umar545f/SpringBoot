package OnlineBookStore;

import java.util.Map;

public class Inventory {
    private Map<Book, Integer> stock;

    public Inventory(Map<Book, Integer> stock) {
        this.stock = stock;
    }

    public boolean isAvailable(Book book, int quantity) {
        return stock.getOrDefault(book, 0) >= quantity;
    }

    public void updateStock(Book book, int quantity) {
        stock.put(book, stock.getOrDefault(book, 0) - quantity);
    }

    // Getters and Setters

    public Map<Book, Integer> getStock() {
        return stock;
    }

    public void setStock(Map<Book, Integer> stock) {
        this.stock = stock;
    }
}

