package MovieTicketBooking;

public class Seat {
    private String seatId;
    private boolean isBooked;

    public Seat(String seatId) {
        this.seatId = seatId;
        this.isBooked = false;
    }

    public String getSeatId() {
        return seatId;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookSeat() {
        this.isBooked = true;
    }
}

