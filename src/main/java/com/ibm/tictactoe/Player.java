package com.ibm.tictactoe;

public class Player {

    private PlayerType playerType;

    public Player(PlayerType playerType) {
        this.playerType=playerType;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public char getMark() {
        return playerType == PlayerType.X ? 'x' : 'o';

    }

}
