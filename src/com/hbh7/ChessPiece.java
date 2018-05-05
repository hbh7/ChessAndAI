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

    public String getOwner() {
        return owner;
    }

    public String printInfo() {

        return String.format("%s,%s,%s", position, pieceType, owner);

    }

    public String displayPiece() {

        return displayName;

    }

    public boolean checkValidMove(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Run some checks first to make sure it's a valid move

        // Checklist
        boolean colorValidCheck = checkValidMove_colorValidCheck(playerNum, originalRow, originalColumn, newRow, newColumn, boardArray);
        boolean movePatternValidCheck = checkValidMove_movePatternValidCheck(playerNum, originalRow, originalColumn, newRow, newColumn, boardArray);
        boolean spaceValidCheck = checkValidMove_spaceValidCheck(playerNum, originalRow, originalColumn, newRow, newColumn, boardArray);

        return colorValidCheck && movePatternValidCheck && spaceValidCheck;
    }

    public boolean checkValidMove_colorValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {
        // Check that the current player has access to move this piece
        if (owner.equals("White") && playerNum == 1) {
            // colorValidCheck Passed
            return true;
        } else if (owner.equals("Black") && playerNum == 2) {
            // colorValidCheck Passed
            return true;
        } else {
            System.out.println("Error: Invalid Move. That piece does not match your color.");
            return false;
        }
    }
    public abstract boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray);

    public boolean checkValidMove_spaceValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {
        // Check that the space requested for start and end are both valid
        // Ex: Original space must be a valid position on the board, and the landing space must also be a valid position
        // on the board, and not of the same color.

        if (Main.convertToArrayIndex(originalRow) >= 0 && Main.convertToArrayIndex(originalRow) < 8 &&
                Main.convertToArrayIndex(originalColumn) >= 0 && Main.convertToArrayIndex(originalColumn) < 8 &&
                Main.convertToArrayIndex(newRow) >= 0 && Main.convertToArrayIndex(newRow) < 8 &&
                Main.convertToArrayIndex(newColumn) >= 0 && Main.convertToArrayIndex(newColumn) < 8) {
            if(boardArray[Main.convertToArrayIndex(newRow)][Main.convertToArrayIndex(newColumn)] != null) {
                if (!boardArray[Main.convertToArrayIndex(originalRow)][Main.convertToArrayIndex(originalColumn)].getOwner().equals(boardArray[Main.convertToArrayIndex(newRow)][Main.convertToArrayIndex(newColumn)].getOwner())) {
                    return true;
                } else {
                    System.out.println("Error. Invalid Move. Requested space contains a piece of the same color. Cannot overtake.");
                    return false;
                }
            } else {
                return true;
            }
        } else {
            System.out.println("Error: Invalid Move. One or both of the piece locations are invalid.");
            return false;
        }
    }

    public abstract boolean move(String toPos);

}
