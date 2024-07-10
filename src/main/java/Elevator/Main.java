package Elevator;

public class Main {
    public static void main(String[] args) {
        ElevatorSystem elevatorSystem = ElevatorSystem.getInstance();

        // Simulate some button presses
        elevatorSystem.getFloors().get(0).getUpButton().press(); // Floor 1 Up
        elevatorSystem.getFloors().get(19).getDownButton().press(); // Floor 20 Down

        // Run the elevator system
        elevatorSystem.run();

    }
}