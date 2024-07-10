package Elevator;

import java.util.PriorityQueue;
import java.util.Queue;

class Elevator {
    private int currentFloor;
    private Direction currentDirection;
    private int minFloor;
    private int maxFloor;
    private boolean doorOpen;
    private PriorityQueue<Integer> requestQueue;

    public int getMaxFloor() {
        return maxFloor;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public Elevator(int minFloor, int maxFloor) {
        this.currentFloor = minFloor;
        this.currentDirection = Direction.NONE;
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.doorOpen = false;
        this.requestQueue = new PriorityQueue<>();
    }

    public void move() {
        if (requestQueue.isEmpty()) {
            currentDirection = Direction.NONE;
            return;
        }

        int targetFloor = requestQueue.poll();
        if (targetFloor > currentFloor) {
            currentDirection = Direction.UP;
        } else if (targetFloor < currentFloor) {
            currentDirection = Direction.DOWN;
        } else {
            currentDirection = Direction.NONE;
        }

        while (currentFloor != targetFloor) {
            if (currentDirection == Direction.UP) {
                currentFloor++;
            } else if (currentDirection == Direction.DOWN) {
                currentFloor--;
            }
            System.out.println("Elevator moving to floor: " + currentFloor);
        }

        openDoor();
    }

    public void openDoor() {
        doorOpen = true;
        System.out.println("Elevator door opened at floor: " + currentFloor);
        closeDoor();
    }

    public void closeDoor() {
        doorOpen = false;
        System.out.println("Elevator door closed at floor: " + currentFloor);
    }

    public void addRequest(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            requestQueue.add(floor);
        } else {
            System.out.println("Floor out of range for this elevator");
        }
    }
    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }
}
