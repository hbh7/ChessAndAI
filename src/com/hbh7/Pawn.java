package com.hbh7;

public class Pawn extends ChessPiece{

    boolean promoted = false;
    String promotedType = "none";

    public Pawn(String pieceType, String owner, String position) {
        super(pieceType, owner, position);
        pieceType = "Pawn";
        pointValue = 1;
    }

    public boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}
