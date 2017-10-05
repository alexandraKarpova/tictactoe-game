package com.ibm.tictactoe;

public class Player {

    private String mark;

    public Player(PlayerType playerType) {
        this.mark = playerType == PlayerType.X ? "x" : "o";
    }

    public String getMark() {
        return mark;
    }
}
