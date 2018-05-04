package com.hbh7;

public class Knight extends ChessPiece{

    private int pointValue = 2;

    public Knight(String pieceType, String owner, String position) {
        super(pieceType, owner, position);
        pieceType = "Knight";
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
