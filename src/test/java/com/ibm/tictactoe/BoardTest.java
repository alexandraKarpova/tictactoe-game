package com.ibm.tictactoe;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Board Test")
public class BoardTest {

    @Test
    @DisplayName("Empty board creation test")
    public void emptyBoardCreation(){
        TicTacToeBoard board = new TicTacToeBoard();
        Assertions.assertEquals(" | | \n" +
                                         "-+-+-\n" +
                                         " | | \n" +
                                         "-+-+-\n" +
                                         " | | ",
                                board.toString());
    }
}
