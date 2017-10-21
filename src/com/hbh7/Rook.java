package com.hbh7;

public class Rook extends ChessPiece{

    public Rook(String owner) {
        super(owner);
        pieceType = "Rook";
        pointValue = 4;
    }

    boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}
