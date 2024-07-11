package MovieTicketBooking;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    private String screenId;
    private int capacity;
    private List<Show> shows;

    public Screen(String screenId, int capacity) {
        this.screenId = screenId;
        this.capacity = capacity;
        this.shows = new ArrayList<>();
    }

    public String getScreenId() {
        return screenId;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void addShow(Show show) {
        this.shows.add(show);
    }
}

