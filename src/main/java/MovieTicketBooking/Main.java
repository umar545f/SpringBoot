package MovieTicketBooking;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieTicketBookingSystem system = new MovieTicketBookingSystem();

        // Create and add a user
        User user = new User("1", "Alice", "alice@example.com");
        system.addUser(user);

        // Create and add a movie
        Movie movie = new Movie("1", "Inception", "Sci-Fi", 148);
        system.addMovie(movie);

        // Create and add a theater
        Theater theater = new Theater("1", "AMC", "Downtown");
        system.addTheater(theater);

        // Create and add a screen
        Screen screen = new Screen("1", 100);
        theater.addScreen(screen);

        // Create and add a show
        Show show = new Show("1", movie, screen, new Date());
        for (int i = 1; i <= 100; i++) {
            show.addSeat(new Seat("S" + i));
        }
        system.addShow(theater.getTheaterId(), screen.getScreenId(), show);

        // Book tickets
        List<String> seatIds = Arrays.asList("S1", "S2", "S3");
        Booking booking = system.bookTickets(user.getUserId(), show.getShowId(), seatIds);
        if (booking != null) {
            System.out.println("Booking successful. Booking ID: " + booking.getBookingId());

            // Make payment
            Payment payment = system.makePayment(booking.getBookingId(), 30.0, "Credit Card");
            if (payment != null) {
                System.out.println("Payment successful. Payment ID: " + payment.getPaymentId());
            } else {
                System.out.println("Payment failed.");
            }
        } else {
            System.out.println("Booking failed.");
        }
    }
}

