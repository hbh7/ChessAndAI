package com.hbh7;

public class Pawn extends ChessPiece{

    private boolean promoted = false;
    private boolean firstMove = true;
    private String promotedType = "none";
    private String pieceType = "Pawn";
    private String owner;
    private int pointValue = 1;
    private int row;
    private int column;


    public Pawn(String owner, String position) {
        super("Pawn", owner, position);
        this.owner = owner;
    }

    public boolean checkValidMove_movePatternValidCheck(int playerNum, int originalRow, String originalColumn, int newRow, String newColumn, ChessPiece[][] boardArray) {

        // Check that the move pattern requested is valid
        // Ex: Pawn can move forward twice on first move, but only forward once on every other move

        if (firstMove) {
            if(owner.equals("White") && (Main.convertToArrayIndex(newRow)-Main.convertToArrayIndex(originalRow) == 1 || Main.convertToArrayIndex(newRow)-Main.convertToArrayIndex(originalRow) == 2)) {
                return true;
            } else if (owner.equals("Black") && (Main.convertToArrayIndex(originalRow)-Main.convertToArrayIndex(newRow) == 1 || Main.convertToArrayIndex(originalRow)-Main.convertToArrayIndex(newRow) == 2)) {
                return true;
            } else {
                System.out.println("Error: Invalid Move. That piece cannot move to that space from its current position.");
                return false;
            }
        } else {
            if(owner.equals("White") && Main.convertToArrayIndex(newRow)-Main.convertToArrayIndex(originalRow) == 1) {
                return true;
            } else if (owner.equals("Black") && Main.convertToArrayIndex(originalRow)-Main.convertToArrayIndex(newRow) == 1) {
                return true;
            } else {
                System.out.println("Error: Invalid Move. That piece cannot move to that space from its current position.");
                return false;
            }
        }

    }

    public boolean move(String toPos) {
        if(firstMove)
            firstMove = false;

        // Test if valid move
        if (true) {
            //position = toPos;
            return true;
        } else {
            return false;
        }

    }
}
