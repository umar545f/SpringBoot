package TrafficLightSystem;

import java.util.List;

public class TrafficLightController {
    private List<TrafficLight> trafficLights;

    public TrafficLightController(List<TrafficLight> trafficLights) {
        this.trafficLights = trafficLights;
    }

    public void changeLights() {
        for (TrafficLight light : trafficLights) {
            LightColor currentColor = light.getColor();
            switch (currentColor) {
                case RED:
                    light.setColor(LightColor.GREEN);
                    break;
                case YELLOW:
                    light.setColor(LightColor.RED);
                    break;
                case GREEN:
                    light.setColor(LightColor.YELLOW);
                    break;
            }
        }
    }
}

