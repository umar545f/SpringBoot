package SnakeLadder;

import java.util.Random;

public class Die {
    private static final int MAX_VALUE = 6;
    private Random random;

    public Die() {
        random = new Random();
    }

    public int roll() {
        return random.nextInt(MAX_VALUE) + 1;
    }
}

