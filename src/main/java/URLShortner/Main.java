package URLShortner;

public class Main {
    public static void main(String[] args) {
        URLShortenerService urlShortenerService = new URLShortenerService();

        // Create a user
        User user = new User("1", "Alice", "alice@example.com");
        urlShortenerService.addUser(user);

        // Shorten a URL
        String originalUrl = "https://www.example.com/very/long/url";
        String shortUrl = urlShortenerService.shortenUrl(originalUrl, user);
        System.out.println("Original URL: " + originalUrl);
        System.out.println("Shortened URL: " + shortUrl);

        // Retrieve the original URL
        String retrievedUrl = urlShortenerService.getOriginalUrl(shortUrl);
        System.out.println("Retrieved URL: " + retrievedUrl);

        // Display the access count
        System.out.println("Access count: " + urlShortenerService.getAccessCount(shortUrl));
    }
}

