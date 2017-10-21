package com.hbh7;

public class Queen extends ChessPiece{

    public Queen(String owner) {
        super(owner);
        pieceType = "Queen";
        pointValue = 5;
    }

    boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}
