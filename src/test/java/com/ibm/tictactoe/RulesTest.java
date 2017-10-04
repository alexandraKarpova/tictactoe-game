package com.ibm.tictactoe;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class RulesTest {

    TicTacToeGame ticTacToeGame = new TicTacToeGame();

    @Test
    public void FirstPinMadeByPlayerX() {
        ticTacToeGame.createPlayerX();
        ticTacToeGame.createPlayerO();
        ticTacToeGame.start();
        ticTacToeGame.nextPin();
        Assertions.assertTrue(ticTacToeGame.getBoard().toString().contains("x"));
    }

    @Test
    public void NextPinMadeByPlayerO() {
        ticTacToeGame.createPlayerX();
        ticTacToeGame.createPlayerO();
        ticTacToeGame.start();
        ticTacToeGame.nextPin();
        ticTacToeGame.nextPin();
        Assertions.assertTrue(ticTacToeGame.getBoard().toString().contains("o"));
    }

    @Test
    public void FilledCellsNotAvailable() {
        TicTacToeBoard board = new TicTacToeBoard();
        Player playerX = new Player(PlayerType.X);
        Player playerO = new Player(PlayerType.O);
        board.tryPin(playerX, 0, 0);
        Assertions.assertFalse(board.tryPin(playerO, 0, 0));
    }

    @Test
    public void PinAtOtherRoundNotAvailable() {
        TicTacToeBoard board = new TicTacToeBoard();
        Player playerX = new Player(PlayerType.X);
        board.tryPin(playerX, 0, 0);
        Assertions.assertFalse(board.tryPin(playerX, 1, 0));
    }
}
