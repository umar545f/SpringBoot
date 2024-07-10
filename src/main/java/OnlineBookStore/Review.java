package OnlineBookStore;

public class Review {
    private String reviewId;
    private User user;
    private Book book;
    private int rating;
    private String comment;

    public Review(String reviewId, User user, Book book, int rating, String comment) {
        this.reviewId = reviewId;
        this.user = user;
        this.book = book;
        this.rating = rating;
        this.comment = comment;
    }

    // Getters and Setters

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
