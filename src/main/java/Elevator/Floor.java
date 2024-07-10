package Elevator;

class Floor {
    private int floorNumber;
    private Button upButton;
    private Button downButton;

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.upButton = new Button(Direction.UP, floorNumber);
        this.downButton = new Button(Direction.DOWN, floorNumber);
    }

    public Button getUpButton() {
        return upButton;
    }

    public Button getDownButton() {
        return downButton;
    }
}
