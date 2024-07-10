package SnakeLadder;

public class Snake {
    private int start;
    private int end;

    public Snake(int start, int end) {
        if (start <= end) {
            throw new IllegalArgumentException("Invalid Snake configuration");
        }
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

