package SnakeLadder;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private Board board;
    private Queue<Player> players;
    private Die die;

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = new LinkedList<>(players);
        this.die = new Die();
    }

    public void play() {
        while (true) {
            Player currentPlayer = players.poll();
            int roll = die.roll();
            int newPosition = currentPlayer.getPosition() + roll;

            if (newPosition > board.getSize()) {
                newPosition = currentPlayer.getPosition(); // No move if exceeds board size
            } else {
                newPosition = board.getPosition(newPosition); // Check for snake or ladder
            }

            currentPlayer.setPosition(newPosition);
            System.out.println(currentPlayer.getName() + " rolled a " + roll + " and moved to " + newPosition);

            if (newPosition == board.getSize()) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            players.offer(currentPlayer); // Put the player back in the queue
        }
    }
}

