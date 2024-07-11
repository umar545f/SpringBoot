package MovieTicketBooking;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Show {
    private String showId;
    private Movie movie;
    private Screen screen;
    private Date startTime;
    private List<Seat> seats;

    public Show(String showId, Movie movie, Screen screen, Date startTime) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.seats = new ArrayList<>();
    }

    public String getShowId() {
        return showId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public Date getStartTime() {
        return startTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat) {
        this.seats.add(seat);
    }
}

