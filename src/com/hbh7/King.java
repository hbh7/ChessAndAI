package com.hbh7;

public class King extends ChessPiece{

    public King(String owner) {
        super(owner);
        pieceType = "King";
        pointValue = 6;
    }

    boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}
