package SnakeLadder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Map<Integer, Integer> boardMap; // Maps start position to end position for snakes and ladders

    public Board(int size, List<Snake> snakes, List<Ladder> ladders) {
        this.size = size;
        this.snakes = snakes;
        this.ladders = ladders;
        boardMap = new HashMap<>();
        for (Snake snake : snakes) {
            boardMap.put(snake.getStart(), snake.getEnd());
        }
        for (Ladder ladder : ladders) {
            boardMap.put(ladder.getStart(), ladder.getEnd());
        }
    }

    public int getSize() {
        return size;
    }

    public int getPosition(int position) {
        return boardMap.getOrDefault(position, position);
    }
}
