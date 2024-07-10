package URLShortner;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class URLShortenerService {
    private static final String BASE_URL = "http://short.url/";
    private static final int SHORT_URL_LENGTH = 6;
    private Map<String, URL> urlDatabase;
    private Map<String, User> userDatabase;

    public URLShortenerService() {
        this.urlDatabase = new HashMap<>();
        this.userDatabase = new HashMap<>();
    }

    public String shortenUrl(String originalUrl, User user) {
        String shortUrl = generateShortUrl();
        URL url = new URL(originalUrl, shortUrl, new Date());
        urlDatabase.put(shortUrl, url);
        user.addUrl(url);
        return BASE_URL + shortUrl;
    }

    public String getOriginalUrl(String shortUrl) {
        URL url = urlDatabase.get(shortUrl.replace(BASE_URL, ""));
        if (url != null) {
            url.incrementAccessCount();
            return url.getOriginalUrl();
        }
        return null; // URL not found
    }

    private String generateShortUrl() {
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder shortUrl = new StringBuilder();
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            int index = (int) (Math.random() * characters.length());
            shortUrl.append(characters.charAt(index));
        }
        return shortUrl.toString();
    }

    public User getUser(String userId) {
        return userDatabase.get(userId);
    }

    public void addUser(User user) {
        userDatabase.put(user.getUserId(), user);
    }

    public int getAccessCount(String shortUrl) {
        URL url = urlDatabase.get(shortUrl.replace(BASE_URL,""));
        return url.getAccessCount();
    }
}
