package URLShortner;

import java.util.Date;

public class URL {
    private String originalUrl;
    private String shortUrl;
    private Date creationDate;
    private int accessCount;

    public URL(String originalUrl, String shortUrl, Date creationDate) {
        this.originalUrl = originalUrl;
        this.shortUrl = shortUrl;
        this.creationDate = creationDate;
        this.accessCount = 0;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public int getAccessCount() {
        return accessCount;
    }

    public void incrementAccessCount() {
        this.accessCount++;
    }
}

