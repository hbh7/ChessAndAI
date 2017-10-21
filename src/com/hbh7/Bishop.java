package com.hbh7;

public class Bishop extends ChessPiece{

    public Bishop(String pieceType, String owner, String position) {
        super(pieceType, owner, position);
        pieceType = "Bishop";
        pointValue = 3;
    }

    public boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}