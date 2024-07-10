package Elevator;

import java.util.List;

class Dispatcher {
    private List<Elevator> elevators;

    public Dispatcher(List<Elevator> elevators) {
        this.elevators = elevators;
    }

    public void dispatchRequest(int floorNumber, Direction direction) {
        // Find the elevator that covers the requested floor
        Elevator bestElevator = null;
        for (Elevator elevator : elevators) {
            if (floorNumber >= elevator.getMinFloor()
                    && floorNumber <= elevator.getMaxFloor()) {
                if (bestElevator == null || Math.abs(elevator.getCurrentFloor() - floorNumber) < Math.abs(bestElevator.getCurrentFloor() - floorNumber)) {
                    bestElevator = elevator;
                }
            }
        }

        if (bestElevator != null) {
            bestElevator.addRequest(floorNumber);
        } else {
            System.out.println("No suitable elevator found for the request.");
        }
    }}