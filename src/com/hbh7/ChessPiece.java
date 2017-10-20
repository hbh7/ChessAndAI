package com.hbh7;

public abstract class ChessPiece {

    String position    = "";
    String pieceName   = "";
    String owner       = "";


    public String printInfo() {
        return (position + "," + pieceName + "," + owner);
    }

    private boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm
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
