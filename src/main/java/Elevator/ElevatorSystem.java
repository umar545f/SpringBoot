package Elevator;

import java.util.ArrayList;
import java.util.List;

class ElevatorSystem {
    private static ElevatorSystem instance;
    private List<Elevator> elevators;
    private List<Floor> floors;
    private Dispatcher dispatcher;

    private ElevatorSystem() {
        elevators = new ArrayList<>();
        floors = new ArrayList<>();
        initializeSystem();
    }

    public static ElevatorSystem getInstance() {
        if (instance == null) {
            instance = new ElevatorSystem();
        }
        return instance;
    }

    private void initializeSystem() {
        int numElevators = 20;
        int floorsPerElevator = 5;

        for (int i = 0; i < numElevators; i++) {
            int minFloor = i * floorsPerElevator + 1;
            int maxFloor = (i + 1) * floorsPerElevator;
            elevators.add(new Elevator(minFloor, maxFloor));
        }

        for (int i = 1; i <= 100; i++) {
            floors.add(new Floor(i));
        }

        dispatcher = new Dispatcher(elevators);
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public List<Elevator> getElevators() {
        return elevators;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void run() {
        // Simulate the elevator system running
        for (Elevator elevator : elevators) {
            elevator.move();
        }
    }
}
