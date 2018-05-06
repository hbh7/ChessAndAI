package com.hbh7;

public class Queen extends ChessPiece{

    private String pieceType = "Queen";
    private String owner;
    private int pointValue = 5;

    public Queen(String owner, String position) {
        super("Queen", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {
        return false;
    }

    public boolean move(String toPos) {
        return false;
    }

    public boolean checkValidMove(String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid = false;

        // Override atm lol
        moveValid = true;

        return moveValid;

    }
}
