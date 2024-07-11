package MovieTicketBooking;

import java.util.Date;
import java.util.List;

public class Booking {
    private String bookingId;
    private User user;
    private Show show;
    private List<Seat> seats;
    private Date bookingDate;

    public Booking(String bookingId, User user, Show show, List<Seat> seats) {
        this.bookingId = bookingId;
        this.user = user;
        this.show = show;
        this.seats = seats;
        this.bookingDate = new Date();
    }

    public String getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Show getShow() {
        return show;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Date getBookingDate() {
        return bookingDate;
    }
}

