package com.ibm.tictactoe;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PlayersTest {
    @Test
    public void PlayerXCreated() {

        Player playerX = new Player(PlayerType.X);
        Assertions.assertEquals("x", playerX.getMark());
    }

    @Test
    public void PlayerOCreated() {
        Player playerO = new Player(PlayerType.O);
        Assertions.assertEquals("o", playerO.getMark());
    }

    @Test
    public void NoExtraPlayersCreated(){

    }
}
