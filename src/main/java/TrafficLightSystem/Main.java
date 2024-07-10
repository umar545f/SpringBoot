package TrafficLightSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create traffic lights
        TrafficLight trafficLight1 = new TrafficLight();
        TrafficLight trafficLight2 = new TrafficLight();
        TrafficLight trafficLight3 = new TrafficLight();

        // Create traffic light controller
        List<TrafficLight> trafficLights = Arrays.asList(trafficLight1, trafficLight2, trafficLight3);
        TrafficLightController controller = new TrafficLightController(trafficLights);

        // Create intersection with roads
        Road road1 = new Road("Main Street");
        Road road2 = new Road("Broadway");

        // Simulate vehicles on roads
        road1.addVehicle(new Vehicle("XYZ749"));
        road2.addVehicle(new Vehicle("XYZ789"));

        List<Road> roads = Arrays.asList(road1, road2);
        Intersection intersection = new Intersection(roads, controller);

        // Simulate traffic light changes
        System.out.println("Initial Traffic Light Colors:");
        printTrafficLightStatus(trafficLights);

        System.out.println("\nOperating Traffic Lights...");
        intersection.operateTrafficLights();

        System.out.println("\nUpdated Traffic Light Colors:");
        printTrafficLightStatus(trafficLights);
    }

    private static void printTrafficLightStatus(List<TrafficLight> trafficLights) {
        for (TrafficLight light : trafficLights) {
            System.out.println("Traffic Light Color: " + light.getColor());
        }
    }
}

