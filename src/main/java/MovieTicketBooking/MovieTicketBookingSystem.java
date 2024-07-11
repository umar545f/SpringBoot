package MovieTicketBooking;

import java.util.*;

public class MovieTicketBookingSystem {
    private Map<String, User> users;
    private Map<String, Movie> movies;
    private Map<String, Theater> theaters;

    public MovieTicketBookingSystem() {
        this.users = new HashMap<>();
        this.movies = new HashMap<>();
        this.theaters = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void addMovie(Movie movie) {
        movies.put(movie.getMovieId(), movie);
    }

    public void addTheater(Theater theater) {
        theaters.put(theater.getTheaterId(), theater);
    }

    public void addShow(String theaterId, String screenId, Show show) {
        Theater theater = theaters.get(theaterId);
        if (theater != null) {
            for (Screen screen : theater.getScreens()) {
                if (screen.getScreenId().equals(screenId)) {
                    screen.addShow(show);
                    show.getMovie().addShow(show);
                }
            }
        }
    }

    public Booking bookTickets(String userId, String showId, List<String> seatIds) {
        User user = users.get(userId);
        Show show = null;
        for (Movie movie : movies.values()) {
            for (Show s : movie.getShows()) {
                if (s.getShowId().equals(showId)) {
                    show = s;
                    break;
                }
            }
        }

        if (user == null || show == null) {
            return null;
        }

        List<Seat> seatsToBook = new ArrayList<>();
        for (String seatId : seatIds) {
            for (Seat seat : show.getSeats()) {
                if (seat.getSeatId().equals(seatId) && !seat.isBooked()) {
                    seatsToBook.add(seat);
                }
            }
        }

        if (seatsToBook.size() != seatIds.size()) {
            return null; // Some seats are already booked
        }

        for (Seat seat : seatsToBook) {
            seat.bookSeat();
        }

        Booking booking = new Booking(UUID.randomUUID().toString(), user, show, seatsToBook);
        user.addBooking(booking);
        return booking;
    }

    public Payment makePayment(String bookingId, double amount, String paymentMethod) {
        Booking booking = null;
        for (User user : users.values()) {
            for (Booking b : user.getBookings()) {
                if (b.getBookingId().equals(bookingId)) {
                    booking = b;
                    break;
                }
            }
        }

        if (booking == null) {
            return null;
        }

        Payment payment = new Payment(UUID.randomUUID().toString(), booking, amount, paymentMethod);
        return payment;
    }
}
