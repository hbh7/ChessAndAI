package com.hbh7;

import static com.hbh7.Util.*;

public class Pawn extends ChessPiece{

    private boolean promoted = false;
    private boolean firstMove = true;
    private String promotedType = "none";
    private String pieceType = "Pawn";
    private String owner;
    private int row;
    private int column;


    public Pawn(String owner, String position) {
        super("Pawn", owner, position);
        this.owner = owner;
        this.pieceValue = 1;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Check that the move pattern requested is valid
        // Ex: Pawn can move forward twice on first move, but only forward once on every other move

        if (firstMove) {
            firstMove = false;
            if(toArrayIndex(originalColumn) == toArrayIndex(newColumn)) {
                if (owner.equals("White") && (toArrayIndex(newRow) - toArrayIndex(originalRow) == 1 || toArrayIndex(newRow) - toArrayIndex(originalRow) == 2)) {
                    return true;
                } else if (owner.equals("Black") && (toArrayIndex(originalRow) - toArrayIndex(newRow) == 1 || toArrayIndex(originalRow) - toArrayIndex(newRow) == 2)) {
                    return true;
                } else {
                    System.out.println("Pawn: Invalid Move. That piece cannot move to that space from its current position.");
                    return false;
                }
            } else {
                System.out.println("Pawn: Invalid Move. Please stay within the same column for this piece unless jumping another.");
                return false;
            }
        } else {

            if(owner.equals("White") && toArrayIndex(newRow) - toArrayIndex(originalRow) == 1) {
                if("Black".equals(boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)].getOwner())) {
                    if(Math.abs(toArrayIndex(newColumn) - toArrayIndex(originalColumn)) == 1) {
                        return true;
                    } else {
                        System.out.println("Pawn: Invalid Move. Cannot jump piece in front.");
                        return false;
                    }
                } else if (toArrayIndex(originalColumn) - toArrayIndex(newColumn) == 0) {
                    return true;
                } else {
                    System.out.println("Pawn: Invalid Move. Cannot jump piece in front.");
                    return false;
                }
            } else if (owner.equals("Black") && toArrayIndex(originalRow) - toArrayIndex(newRow) == 1) {
                if("White".equals(boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)].getOwner())) {
                    if(Math.abs(toArrayIndex(originalColumn) - toArrayIndex(newColumn)) == 1) {
                        return true;
                    } else {
                        System.out.println("Pawn: Invalid Move. Cannot jump piece in front.");
                        return false;
                    }
                } else if (Math.abs(toArrayIndex(originalColumn) - toArrayIndex(newColumn)) == 0) {
                    return true;
                } else {
                    System.out.println("Pawn: Invalid Move. Cannot jump piece in front.");
                    return false;
                }
            } else {
                System.out.println("Pawn: Invalid Move. That piece cannot move to that space from its current position.");
                return false;
            }
        }

    }

    public PieceData aiFindSpacesToAttack(ChessPiece[][] boardArray) {
        if(boardArray[arrayPosRow + 1][arrayPosColumn+1] != null) {
            if(boardArray[arrayPosRow + 1][arrayPosColumn+1].getOwner().equals("White")) {
                return new PieceData(arrayPosRow+1, arrayPosColumn+1, this.pieceValue);
            }

        } else if(boardArray[arrayPosRow + 1][arrayPosColumn-1] != null) {
            if(boardArray[arrayPosRow + 1][arrayPosColumn-1].getOwner().equals("White")) {
                return new PieceData(arrayPosRow+1, arrayPosColumn-1, this.pieceValue);
            }
        } else {
            return null;
        }
        return null;
    }
}

