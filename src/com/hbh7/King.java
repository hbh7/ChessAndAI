package com.hbh7;

public class King extends ChessPiece{

    private int pointValue = 6;

    public King(String pieceType, String owner, String position) {
        super(pieceType, owner, position);
        pieceType = "King";
    }

    public boolean checkValidMove(String originalRow, int originalColumn, String newRow, int newColumn) {
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
