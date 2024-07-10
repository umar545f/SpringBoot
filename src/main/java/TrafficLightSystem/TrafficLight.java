package TrafficLightSystem;

public class TrafficLight {
    private LightColor color;

    public TrafficLight() {
        this.color = LightColor.RED; // Initial state
    }

    public LightColor getColor() {
        return color;
    }

    public void setColor(LightColor color) {
        this.color = color;
    }
}
