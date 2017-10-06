package com.ibm.tictactoe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Players Test")
public class PlayersTest {

    private TicTacToeGame ticTacToeGame = new TicTacToeGame();

    @DisplayName("Player X created")
    @Test
    public void PlayerXCreated() {
        ticTacToeGame.createPlayerX();
        Assertions.assertEquals('x', ticTacToeGame.getPlayerX().getMark());
    }

    @DisplayName("Player O created")
    @Test
    public void PlayerOCreated() {
        ticTacToeGame.createPlayerO();
        Assertions.assertEquals('o', ticTacToeGame.getPlayerO().getMark());
    }

    @DisplayName("Players created")
    @Test
    public void PlayersCreated() {
        ticTacToeGame.createPlayerX();
        ticTacToeGame.createPlayerO();
        Assertions.assertAll(() -> Assertions.assertNotNull(ticTacToeGame.getPlayerX())
                , () -> Assertions.assertNotNull(ticTacToeGame.getPlayerO()));
    }
}
