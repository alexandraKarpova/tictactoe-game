package com.ibm.tictactoe;

public class TicTacToeBoard {

    private char[][] board;

    public TicTacToeBoard() {
        this.board = new char[3][3];
    }

    public char[][] getBoard() {
        return board;
    }

    public char replaceEmpty(char boardCell) {
        return (boardCell == '\u0000') ? ' ' : boardCell;
    }

    @Override
    public String toString() {
        StringBuilder boardBuilder = new StringBuilder();
        boardBuilder.append(replaceEmpty(board[0][0])).append('|').append(replaceEmpty(board[0][1])).append('|')
                .append(replaceEmpty(board[0][2])).append('\n').append("-+-+-\n")
                .append(replaceEmpty(board[1][0])).append('|').append(replaceEmpty(board[1][1])).append('|')
                .append(replaceEmpty(board[1][2])).append('\n').append("-+-+-\n")
                .append(replaceEmpty(board[2][0])).append('|').append(replaceEmpty(board[2][1])).append('|')
                .append(replaceEmpty(board[2][2]));
        return boardBuilder.toString();
    }


    public boolean tryPin(Player player, int row, int column) {
        char cellValue = board[row][column];
        int Xpins = 0;
        int Opins = 0;
        for (char[] r : board) {
            for (char c : r) {
                if (c == 'x') {
                    Xpins++;
                } else if (c == 'o') {
                    Opins++;
                }
            }
        }
        if ((player.getPlayerType() == PlayerType.O && Xpins > Opins) ||
                player.getPlayerType() == PlayerType.X && Xpins == Opins) {
            if (cellValue == '\u0000') {
                board[row][column] = player.getMark();
                return true;
            }
        }
        return false;
    }
}
