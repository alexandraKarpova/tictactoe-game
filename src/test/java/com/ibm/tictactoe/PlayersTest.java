package com.ibm.tictactoe;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PlayersTest {

    private TicTacToeGame ticTacToeGame = new TicTacToeGame();

    @Test
    public void PlayerXCreated() {
        ticTacToeGame.createPlayerX();
        Assertions.assertEquals("x", ticTacToeGame.getPlayerX().getMark());
    }

    @Test
    public void PlayerOCreated() {
        ticTacToeGame.createPlayerO();
        Assertions.assertEquals("o", ticTacToeGame.getPlayerO().getMark());
    }

    @Test
    public void NoExtraPlayersCreated() {
        ticTacToeGame.createPlayerX();
        ticTacToeGame.createPlayerO();
        Assertions.assertAll(() -> Assertions.assertNotNull(ticTacToeGame.getPlayerX())
                , () -> Assertions.assertNotNull(ticTacToeGame.getPlayerO()));
    }
}
