package com.hbh7;

public class Bishop extends ChessPiece{

    private int pointValue = 3;

    public Bishop(String pieceType, String owner, String position) {
        super(pieceType, owner, position);
        pieceType = "Bishop";
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {
        return false;
    }

    public boolean move(String toPos) {
        return false;
    }

    public boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}
