package com.hbh7;

public class Rook extends ChessPiece{

    private String pieceType = "Rook";
    private String owner;
    private int pointValue = 4;

    public Rook(String owner, String position) {
        super("Rook", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {
        return true;
    }

}
