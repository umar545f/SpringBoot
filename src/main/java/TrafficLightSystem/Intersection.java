package TrafficLightSystem;

import java.util.List;

public class Intersection {
    private List<Road> roads;
    private TrafficLightController controller;

    public Intersection(List<Road> roads, TrafficLightController controller) {
        this.roads = roads;
        this.controller = controller;
    }

    public void operateTrafficLights() {
        // Logic to operate traffic lights based on traffic conditions or a timer
        controller.changeLights();
    }
}

