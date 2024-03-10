package DesignPattern.TicTacToe;

import ch.qos.logback.core.joran.sanity.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size)
    {
        this.size = size;
        board = new PlayingPiece[size][size];
    }


    public boolean addPiece
            (int inputRow, int inputColumn, PlayingPiece playingPiece)
    {
        if(board[inputRow][inputColumn] != null)
        {
            return false;
        }
        board[inputRow][inputColumn] = playingPiece;
        return true;
    }

    public void printBoard() {
        for(int i =0 ; i< size ; i++)
        {
            for(int j =0 ; j< size ; j++)
            {
                if(board[i][j] != null)
                {
                    System.out.print(board[i][j].pieceType.name() + " ");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<Cell> getFreeCells() {
        List<Cell> freeCells = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    Cell cell = new Cell(i, j);
                    freeCells.add(cell);
                }
            }
        }

        return freeCells;
    }

}
