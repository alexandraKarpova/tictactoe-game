package com.ibm.tictactoe;

import java.util.Random;

public class TicTacToeGame {

    private TicTacToeBoard board;
    private Player playerX;
    private Player playerO;
    private int pinCounter;

    private boolean state;
    private String message;

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
        this.state = true;
//        createPlayerX();
//        createPlayerO();
//        System.out.println(Strings.GAME_STARTED + board.toString());
//        while (state){
//            nextPin();
//        System.out.println(Strings.PIN +pinCounter+'\n' + board.toString());
//        }
    }

    public void nextPin() {
        Player player;
        if (pinCounter % 2 == 0) {
            player = playerX;
        } else {
            player = playerO;
        }
        Random randomIndex = new Random();
        int row = randomIndex.nextInt(3);
        int column = randomIndex.nextInt(3);
        if (!board.tryPin(player, row, column)) {
            nextPin();
        } else {
            pinCounter++;
            checkBoard();
        }

    }

    private void checkBoard() {
        //checks horizontal, vertical, diagonal lines
//if no empty cells left
        //check game finished in a draw
        if (board.isRowCopleted()){
            finish(Strings.ROW);
        } else if (board.isColumnCompleted()){
            finish(Strings.COLUMN);
        } else if (board.isDiagonalCompleted()){
            finish(Strings.DIAGONAL);
        } else if (!board.hasEmptyCells()){
            finish(Strings.DRAW);
        }
    }

    private void finish(String result){
        state=false;
        message=result;
        System.out.println(message);
    }

    public TicTacToeBoard getBoard() {
        return board;
    }

    public boolean getState() {
        return state;
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.start();
        ticTacToeGame.createPlayerX();
        ticTacToeGame.createPlayerO();
        System.out.println(Strings.GAME_STARTED + ticTacToeGame.getBoard().toString());

        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n' + ticTacToeGame.getBoard().toString());
        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n'+ ticTacToeGame.getBoard().toString());
        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n'+ ticTacToeGame.getBoard().toString());
        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n'+ ticTacToeGame.getBoard().toString());
        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n' + ticTacToeGame.getBoard().toString());
        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n' + ticTacToeGame.getBoard().toString());
        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n' + ticTacToeGame.getBoard().toString());
        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n' + ticTacToeGame.getBoard().toString());
        ticTacToeGame.nextPin();
        System.out.println(Strings.PIN+ '\n'+ ticTacToeGame.getBoard().toString());
    }
}
