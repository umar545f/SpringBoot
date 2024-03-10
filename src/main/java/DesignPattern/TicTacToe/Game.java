package DesignPattern.TicTacToe;

import ch.qos.logback.core.joran.sanity.Pair;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Deque<Player> players;

    Board board;

    Game()
    {
        initializeGame();
    }

    private void initializeGame() {
        players = new LinkedList<>();

        PieceX pieceX = new PieceX();
        Player player1 = new Player("Player 1",pieceX);

        PieceO pieceO = new PieceO();
        Player player2 = new Player("Player 2" ,pieceO);

        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;

        while (noWinner)
        {
            Player playerTurn = players.removeFirst();
            board.printBoard();
            List<Cell> freeSpaces = board.getFreeCells();
            if(freeSpaces.isEmpty())
            {
                noWinner = false;
                continue;
            }

            System.out.print("Player:"+playerTurn.name+" Enter row,column : ");

            Scanner input = new Scanner(System.in);
            String s = input.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAdded = board.
                    addPiece(inputRow,inputColumn,playerTurn.playingPiece);
            if(!pieceAdded)
            {
                System.out.println("Incorrect position chosen , please try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean isThereWinner = findWinner
                    (inputRow,inputColumn,playerTurn.playingPiece.pieceType);

            if(isThereWinner)
            {
                return playerTurn.name;
            }
        }
        return "tie";
    }

    private boolean findWinner
            (int inputRow, int inputColumn, PieceType pieceType)
    {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true ;
        boolean antiDiagonalMatch = true ;

        for(int i = 0 ; i < board.size ;i++)
        {
            if(board.board[inputRow][i] == null ||
                    board.board[inputRow][i].pieceType != pieceType)
            {
                rowMatch = false;
            }
        }

        for(int i = 0 ; i< board.size ; i++)
        {
            if(board.board[i][inputColumn] == null ||
               board.board[i][inputColumn].pieceType != pieceType)
            {
                columnMatch = false;
            }
        }

        for(int i =0,j=0 ; i < board.size ; i++,j++)
        {
            if(board.board[i][j] == null
                    || board.board[i][j].pieceType != pieceType)
            {
                diagonalMatch = false;
            }
        }

        for(int i = 0 , j =board.size -1 ; i < board.size ; i++,j--)
        {
            if(board.board[i][j] == null
                    || board.board[i][j].pieceType != pieceType)
            {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
