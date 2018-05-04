package com.hbh7;

public class Pawn extends ChessPiece{

    private boolean promoted = false;
    private String promotedType = "none";
    private String pieceType = "Pawn";
    private int pointValue = 1;
    private int row;
    private int column;

    public Pawn(String owner, String position) {
        super("Pawn", owner, position);
    }

    public boolean checkValidMove(String originalRow, String originalColumn, String newRow, String newColumn) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }

    public boolean move(String toPos) {

        // Test if valid move
        if (true) {
            //position = toPos;
            return true;
        } else {
            return false;
        }

    }
}
