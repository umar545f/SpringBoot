package MovieTicketBooking;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String movieId;
    private String title;
    private String genre;
    private int duration; // in minutes
    private List<Show> shows;

    public Movie(String movieId, String title, String genre, int duration) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.shows = new ArrayList<>();
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }
}
