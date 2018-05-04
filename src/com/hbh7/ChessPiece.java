package com.hbh7;

import java.util.Objects;

public abstract class ChessPiece {

    private String position    = "";
    private String pieceType   = "";
    private String owner       = "";
    private String displayName = "";
    private int pointValue     = 0;

    public ChessPiece(String pieceType, String owner, String position) {
        this.pieceType = pieceType;
        this.owner = owner;
        this.position = position;

        switch (pieceType.toLowerCase()) {
            case "pawn":
                this.displayName = String.format(" %s %s  ", owner, pieceType);
                break;
            case "rook":
                this.displayName = String.format(" %s %s  ", owner, pieceType);
                break;
            case "bishop":
                this.displayName = String.format("%s %s ", owner, pieceType);
                break;
            case "knight":
                this.displayName = String.format("%s %s ", owner, pieceType);
                break;
            case "king":
                this.displayName = String.format(" %s %s  ", owner, pieceType);
                break;
            case "queen":
                this.displayName = String.format(" %s %s ", owner, pieceType);
                break;
        }
    }

    public String printInfo() {

        return String.format("%s,%s,%s", position, pieceType, owner);

    }

    public String displayPiece() {

        return displayName;

    }

    public abstract boolean checkValidMove(String originalRow, String originalColumn, String newRow, String newColumn);

    public abstract boolean move(String toPos);

}
