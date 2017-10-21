package com.hbh7;

public class ChessPiece {

    String position    = "";
    String pieceType = "";
    String owner       = "";
    int pointValue     = 0;

    public ChessPiece(String pieceType, String owner, String position) {
        this.pieceType = pieceType;
        this.owner = owner;
        this.position = position;
    }

    public String printInfo() {

        return String.format("%s,%s,%s", position, pieceType, owner);

    }

    public boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }

    public boolean move(String toPos) {

        // Test if valid move
        if (checkValidMove(position, toPos)) {
            position = toPos;
            return true;
        } else {
            return false;
        }

    }

}
