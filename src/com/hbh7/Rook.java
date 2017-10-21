package com.hbh7;

public class Rook extends ChessPiece{

    public Rook(String pieceType, String owner, String position) {
        super(pieceType, owner, position);
        pieceType = "Rook";
        pointValue = 4;
    }

    public boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}
