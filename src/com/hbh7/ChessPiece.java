package com.hbh7;

public abstract class ChessPiece {

    String position    = "";
    String pieceName   = "";
    String owner       = "";


    public String printInfo() {

        return String.format("%s,%s,%s", position, pieceName, owner);

    }

    abstract boolean checkValidMove(String currentPos, String nextPos);

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
