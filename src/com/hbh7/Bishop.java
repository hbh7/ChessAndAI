package com.hbh7;

public class Bishop extends ChessPiece{

    private String pieceType = "Bishop";
    private String owner;
    private int pointValue = 3;

    public Bishop(String owner, String position) {
        super("Bishop", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {
        return true;
    }

}
