package TrafficLightSystem;

import java.util.ArrayList;
import java.util.List;

public class Road {
    private String roadName;
    private List<Vehicle> vehicles;

    public Road(String roadName) {
        this.roadName = roadName;
        this.vehicles = new ArrayList<>();
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }


    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}

