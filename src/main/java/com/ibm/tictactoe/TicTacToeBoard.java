package com.ibm.tictactoe;

public class TicTacToeBoard {
    private String board;

    public TicTacToeBoard() {
        this.board = " | | \n" +
                     "-+-+-\n" +
                     " | | \n" +
                     "-+-+-\n" +
                     " | | ";
    }

    @Override
    public String toString() {
        return board;
    }
}
