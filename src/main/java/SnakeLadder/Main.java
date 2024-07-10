package SnakeLadder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Snake snake1 = new Snake(14, 7);
        Snake snake2 = new Snake(22, 3);
        Ladder ladder1 = new Ladder(8, 15);
        Ladder ladder2 = new Ladder(10, 25);

        Board board = new Board(30, Arrays.asList(snake1, snake2), Arrays.asList(ladder1, ladder2));
        Player player1 = new Player("Alice");
        Player player2 = new Player("Bob");

        Game game = new Game(board, Arrays.asList(player1, player2));
        game.play();
    }
}

