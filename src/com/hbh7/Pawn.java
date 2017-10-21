package com.hbh7;

public class Pawn extends ChessPiece{

    public Pawn(String owner) {
        super(owner);
        pieceType = "Pawn";
        pointValue = 1;
    }

    boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}
