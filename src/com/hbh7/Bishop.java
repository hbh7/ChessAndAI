package com.hbh7;

public class Bishop extends ChessPiece{

    private String pieceType = "Bishop";
    private String owner;
    private int pointValue = 3;

    public Bishop(String owner, String position) {
        super("Bishop", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Check that the move pattern requested is valid
        // Ex: Bishop can move diagonal in any direction an unlimited number of spaces until it hits the border or
        // another piece. It is stuck on one color forever.

        return true;
    }

}
