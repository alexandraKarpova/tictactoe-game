package com.ibm.tictactoe;

public class TicTacToeBoard {

    private char[][] board;

    public TicTacToeBoard() {
        this.board = new char[3][3];
    }

    public char replaceEmpty(char boardCell) {
        return (boardCell == '\u0000') ? ' ' : boardCell;
    }

    @Override
    public String toString() {
        StringBuilder boardBuilder = new StringBuilder();
        boardBuilder.append(replaceEmpty(this.board[0][0])).append('|').append(replaceEmpty(this.board[0][1])).append('|')
                .append(replaceEmpty(this.board[0][2])).append('\n').append(Strings.SEPARATOR)
                .append(replaceEmpty(this.board[1][0])).append('|').append(replaceEmpty(this.board[1][1])).append('|')
                .append(replaceEmpty(this.board[1][2])).append('\n').append(Strings.SEPARATOR)
                .append(replaceEmpty(this.board[2][0])).append('|').append(replaceEmpty(this.board[2][1])).append('|')
                .append(replaceEmpty(this.board[2][2]));
        return boardBuilder.toString();
    }


    public boolean tryPin(Player player, int row, int column) {
        char cellValue = this.board[row][column];
        int Xpins = 0;
        int Opins = 0;
        for (char[] r : this.board) {
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
                this.board[row][column] = player.getMark();
                return true;
            }
        }
        return false;
    }

    public boolean isRowCopleted() {

        for (char[] row : this.board) {
            if (row[0] != '\u0000' && row[0] == row[1] && row[1] == row[2]) {
                return true;
            }
        }
        return false;
    }

    public boolean isColumnCompleted() {

        for (int i = 0; i < board.length; i++) {
            if (board[0][i] != '\u0000' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isDiagonalCompleted() {
        if ((board[0][0] != '\u0000' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                board[0][2] != '\u0000' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    public boolean hasEmptyCells() {
        return toString().contains(Strings.SPACE);

    }
}
