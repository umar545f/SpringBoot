package URLShortner;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private String email;
    private List<URL> urls;

    public User(String userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.urls = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<URL> getUrls() {
        return urls;
    }

    public void addUrl(URL url) {
        this.urls.add(url);
    }
}

