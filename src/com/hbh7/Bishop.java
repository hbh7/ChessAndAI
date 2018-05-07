package com.hbh7;

import static com.hbh7.Util.*;

public class Bishop extends ChessPiece{

    private String pieceType = "Bishop";
    private String owner;
    private int pointValue = 3;

    public Bishop(String owner, String position) {
        super("Bishop", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Check that the move pattern requested is valid
        // Ex: Bishop can move diagonal in any direction an unlimited number of spaces until it hits the border or
        // another piece. It is stuck on one color forever.

        if(Math.abs(toArrayIndex(originalRow)-toArrayIndex(newRow)) == Math.abs(toArrayIndex(originalColumn)-toArrayIndex(newColumn))) {

            int distance = Math.abs(toArrayIndex(originalRow)-toArrayIndex(newRow));

            if(toArrayIndex(newRow) < toArrayIndex(originalRow) && toArrayIndex(newColumn) > toArrayIndex(originalColumn)) { // going to top right
                System.out.println("Going to top right");
                for(int i = 1; i < distance; i++) {
                    if(boardArray[toArrayIndex(originalRow)-i][toArrayIndex(originalColumn)+i] != null) {
                        System.out.println("Error: Invalid Move. Piece(s) obstructing path.");
                        return false;
                    }
                }
                return true;

            } else if(toArrayIndex(newRow) < toArrayIndex(originalRow) && toArrayIndex(newColumn) < toArrayIndex(originalColumn)) { // going to top left
                System.out.println("Going to top left");
                for(int i = 1; i < distance; i++) {
                    if(boardArray[toArrayIndex(originalRow)-i][toArrayIndex(originalColumn)-i] != null) {
                        System.out.println("Error: Invalid Move. Piece(s) obstructing path.");
                        return false;
                    }
                }
                return true;

            } else if(toArrayIndex(newRow) > toArrayIndex(originalRow) && toArrayIndex(newColumn) > toArrayIndex(originalColumn)) { // going to bottom right
                System.out.println("Going to bottom right");
                for(int i = 1; i < distance; i++) {
                    if(boardArray[toArrayIndex(originalRow)+i][toArrayIndex(originalColumn)+i] != null) {
                        System.out.println("Error: Invalid Move. Piece(s) obstructing path.");
                        return false;
                    }
                }
                return true;

            } else if(toArrayIndex(newRow) > toArrayIndex(originalRow) && toArrayIndex(newColumn) < toArrayIndex(originalColumn)) { // going to bottom left
                System.out.println("Going to bottom left");
                for(int i = 1; i < distance; i++) {
                    if(boardArray[toArrayIndex(originalRow)+i][toArrayIndex(originalColumn)-i] != null) {
                        System.out.println("Error: Invalid Move. Piece(s) obstructing path.");
                        return false;
                    }
                }
                return true;

            } else {
                System.out.println("Error: Honestly I have no idea how you got here.");
                return false;
            }

        } else {
            System.out.println("Error: Invalid Move. Bishop can only move diagonally.");
            return false;
        }


    }

}
