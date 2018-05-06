package com.hbh7;

public class Knight extends ChessPiece{

    private String pieceType = "Knight";
    private String owner;
    private int pointValue = 2;

    public Knight(String owner, String position) {
        super("Knight", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {
        return true;
    }

}
