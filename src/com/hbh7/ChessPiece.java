package com.hbh7;

import java.util.Objects;

public class ChessPiece {

    String position    = "";
    String pieceType   = "";
    String owner       = "";
    String displayName = "";
    int pointValue     = 0;

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

    public boolean checkValidMove(String pieceType, String currentPos, String nextPos) {

        // Run some checks first to make sure it's a valid move
        boolean moveValid;

        switch (pieceType.toLowerCase()) {
            case "pawn":
                moveValid = true; // lol
                break;
            case "bishop":
                moveValid = true; // lol
                break;
            case "rook":
                moveValid = true; // lol
                break;
            case "knight":
                moveValid = true; // lol
                break;
            case "king":
                moveValid = true; // lol
                break;
            case "queen":
                moveValid = true; // lol
                break;
            default:
                moveValid = false; // lol
                break;
        }

        return moveValid;

    }

    public boolean move(String toPos) {

        // Test if valid move
        if (checkValidMove(pieceType, position, toPos)) {
            position = toPos;
            return true;
        } else {
            return false;
        }

    }

}
