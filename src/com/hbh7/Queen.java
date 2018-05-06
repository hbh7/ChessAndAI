package com.hbh7;

public class Queen extends ChessPiece{

    private String pieceType = "Queen";
    private String owner;
    private int pointValue = 5;

    public Queen(String owner, String position) {
        super("Queen", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Check that the move pattern requested is valid
        // Ex: Queen can move in any direction forwards, backwards, left, right, or diagonal an unlimited number of spaces
        // until it hits a border or another piece. It cannot move like a Knight.

        return true;
    }

}
