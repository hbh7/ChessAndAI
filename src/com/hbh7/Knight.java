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

        return true;
    }

}
