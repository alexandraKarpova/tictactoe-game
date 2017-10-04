package com.ibm.tictactoe;

import java.util.Random;

public class TicTacToeGame {

    private TicTacToeBoard board;
    private Player playerX;
    private Player playerO;
    private int pinCounter;

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

    public void start() {
        this.board = new TicTacToeBoard();
    }

    public void nextPin() {
        if (pinCounter % 2 == 0) {
            doPin(playerX);
        } else {
            doPin(playerO);
        }
        pinCounter++;
    }

    private void doPin(Player player) {
        Random randomIndex= new Random();
        int row = randomIndex.nextInt(3);
        int column = randomIndex.nextInt(3);
        board.tryPin(player, row, column);
    }

    public TicTacToeBoard getBoard() {
        return board;
    }
}
