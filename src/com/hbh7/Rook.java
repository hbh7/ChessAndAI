package com.hbh7;

public class Rook extends ChessPiece{

    private int pointValue = 4;

    public Rook(String pieceType, String owner, String position) {
        super(pieceType, owner, position);
        pieceType = "Rook";
    }

    public boolean checkValidMove(String originalRow, String originalColumn, String newRow, String newColumn) {
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
