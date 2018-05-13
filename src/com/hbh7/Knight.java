package com.hbh7;

import static com.hbh7.Util.*;

public class Knight extends ChessPiece{

    private String pieceType = "Knight";
    private String owner;
    private int pointValue = 2;

    public Knight(String owner, String position) {
        super("Knight", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Check that the move pattern requested is valid
        // Ex: Knight can move in an L shape (2 forward and one to either side) in any direction, hopping over (but not destroying) pieces between the
        // starting point and destination

        if (toArrayIndex(originalRow) - toArrayIndex(newRow) == 2 && toArrayIndex(newColumn) - toArrayIndex(originalColumn) == -1) { // Up 2 left 1
            System.out.println("Knight: Going up 2, left 1");
            return true;
        } else if (toArrayIndex(originalRow) - toArrayIndex(newRow) == 2 && toArrayIndex(newColumn) - toArrayIndex(originalColumn) == 1) { // Up 2 right 1
            System.out.println("Knight: Going up 2, right 1");
            return true;
        } else if (toArrayIndex(originalRow) - toArrayIndex(newRow) == -2 && toArrayIndex(newColumn) - toArrayIndex(originalColumn) == -1) { // Down 2 left 1
            System.out.println("Knight: Going down 2, left 1");
            return true;
        } else if (toArrayIndex(originalRow) - toArrayIndex(newRow) == -2 && toArrayIndex(newColumn) - toArrayIndex(originalColumn) == 1) { // Down 2 right 1
            System.out.println("Knight: Going down 2, right 1");
            return true;
        } else if (toArrayIndex(originalColumn) - toArrayIndex(newColumn) == 2 && toArrayIndex(newRow) - toArrayIndex(originalRow) == -1) { // Left 2 up 1
            System.out.println("Knight: Going left 2, up 1");
            return true;
        } else if (toArrayIndex(originalColumn) - toArrayIndex(newColumn) == 2 && toArrayIndex(newRow) - toArrayIndex(originalRow) == 1) { // Left 2 down 1
            System.out.println("Knight: Going left 2, down 1");
            return true;
        } else if (toArrayIndex(originalColumn) - toArrayIndex(newColumn) == -2 && toArrayIndex(newRow) - toArrayIndex(originalRow) == -1) { // Right 2 up 1
            System.out.println("Knight: Going right 2, up 1");
            return true;
        } else if (toArrayIndex(originalColumn) - toArrayIndex(newColumn) == -2 && toArrayIndex(newRow) - toArrayIndex(originalRow) == 1) { // Right 2 down 1
            System.out.println("Knight: Going right 2, down 1");
            return true;
        } else {
            System.out.println("Knight: Invalid Move. Can only move in an L pattern.");
            return false;
        }
    }

}
