package com.hbh7;

import static com.hbh7.Util.*;

public abstract class ChessPiece {

    private String position     = "";
    private String pieceType    = "";
    private String owner        = "";
    private String displayName  = "";
    public int pieceValue = 0;
    public int arrayPosRow      = 0;
    public int arrayPosColumn   = 0;

    public ChessPiece(String pieceType, String owner, String position) {
        this.pieceType = pieceType;
        this.owner = owner;
        this.position = position;

        this.arrayPosRow = toArrayIndex(position.toCharArray()[0]);
        this.arrayPosColumn = toArrayIndex(position.toCharArray()[1]);

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

    public String getPieceType() {
        return pieceType;
    }

    public String printInfo() {
        return String.format("%s,%s,%s", position, pieceType, owner);
    }

    public String displayPiece() {
        return displayName;
    }

    public void setPosition(int arrayPosRow, int arrayPosColumn) {
        this.arrayPosRow = arrayPosRow;
        this.arrayPosColumn = arrayPosColumn;
    }

    public boolean checkValidMove(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Run some checks first to make sure it's a valid move

        // Checklist
        boolean colorValidCheck = checkValidMove_colorValidCheck(playerNum);
        boolean movePatternValidCheck = checkValidMove_movePatternValidCheck(playerNum, originalRow, originalColumn, newRow, newColumn, boardArray);
        boolean spaceValidCheck = checkValidMove_spaceValidCheck(originalRow, originalColumn, newRow, newColumn, boardArray);

        // Should add in code eventually that says new position cant be the same as the old position

        return colorValidCheck && movePatternValidCheck && spaceValidCheck;
    }

    public boolean checkValidMove_colorValidCheck(int playerNum) {
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

    public boolean checkValidMove_spaceValidCheck(int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {
        // Check that the space requested for start and end are both valid
        // Ex: Original space must be a valid position on the board, and the landing space must also be a valid position
        // on the board, and not of the same color.

        if (toArrayIndex(originalRow) >= 0 && toArrayIndex(originalRow) < 8 &&
                toArrayIndex(originalColumn) >= 0 && toArrayIndex(originalColumn) < 8 &&
                toArrayIndex(newRow) >= 0 && toArrayIndex(newRow) < 8 &&
                toArrayIndex(newColumn) >= 0 && toArrayIndex(newColumn) < 8) {
            if(boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)] != null) {
                if (!boardArray[toArrayIndex(originalRow)][toArrayIndex(originalColumn)].getOwner().equals(boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)].getOwner())) {
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

    public abstract PieceData aiFindSpacesToAttack(ChessPiece[][] boardArray);

}
