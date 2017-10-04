package com.ibm.tictactoe;

public class TicTacToeGame {

    private Player playerX;
    private Player playerO;

    public void createPlayerX() {
        this.playerX = new Player(PlayerType.X);
    }

    public Player getPlayerX() {
        return playerX;
    }

    public void createPlayerO() {
        this.playerO = new Player(PlayerType.O);
    }

    public Player getPlayerO() {
        return playerO;
    }

}
