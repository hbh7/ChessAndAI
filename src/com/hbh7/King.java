package com.hbh7;

import static com.hbh7.Util.*;

public class King extends ChessPiece{

    private String pieceType = "King";
    private String owner;
    private int pointValue = 6;

    public King(String owner, String position) {
        super("King", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Check that the move pattern requested is valid
        // Ex: King can move to any of the 8 spaces immediately around it. It can only move one space.

        if(Math.abs(toArrayIndex(originalColumn) - toArrayIndex(newColumn)) <= 1 &&
                Math.abs(toArrayIndex(originalRow) - toArrayIndex(newRow)) <= 1) {
            // Eventually make sure the king cant suicide
            return true;
        } else {
            System.out.println("Error: Invalid Move. The king cannot move more than 1 space in any direction.");
            return false;
        }


    }

}
