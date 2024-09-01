package Elevator;

public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

        // Simulate some button presses
        elevatorSystem.getFloors().get(4).getUpButton().press(); // Floor 5 Up button
        elevatorSystem.getFloors().get(22).getDownButton().press(); // Floor 23 Down

        // Run the elevator system
        elevatorSystem.run();
    }
}