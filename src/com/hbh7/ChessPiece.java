package com.hbh7;

public abstract class ChessPiece {

    String position    = "";
    String pieceType = "";
    String owner       = "";
    int pointValue     = 0;

    public ChessPiece(String owner, String position) {
        this.owner = owner;
        this.position = position;
    }

    public String printInfo() {

        return String.format("%s,%s,%s", position, pieceType, owner);

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
