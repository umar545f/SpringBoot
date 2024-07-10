package Elevator;

class Button {
    private Direction direction;
    private int floorNumber;
    private boolean pressed;

    public Button(Direction direction, int floorNumber) {
        this.direction = direction;
        this.floorNumber = floorNumber;
        this.pressed = false;
    }

    public void press() {
        pressed = true;
        System.out.println("Button pressed at floor: " + floorNumber + " for direction: " + direction);
        // Send request to dispatcher
        ElevatorSystem.getInstance().getDispatcher().dispatchRequest(floorNumber, direction);
    }

    public void reset() {
        pressed = false;
    }

    public boolean isPressed() {
        return pressed;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}