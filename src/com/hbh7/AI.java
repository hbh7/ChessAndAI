package com.hbh7;

public class AI {

    private int difficulty;

    public AI(int difficulty) {
        this.difficulty = difficulty;
    }

    public void doTurn(ChessPiece[][] boardArray) {

    }

    private String surveyBoard(ChessPiece[][] boardArray) {
        // First check if we're in danger
        for(ChessPiece[] r: boardArray) {
            for (ChessPiece piece : r) {
                if(piece.getOwner().equals("White")) {
                    PieceData target = piece.aiFindSpacesToAttack(boardArray);
                    if(target != null) {
                        // Perhaps have that piece in danger move!
                        //boardArray[target.targetRow][target.targetColumn].checkValidMove()

                        // idk what this was going to be...
                        if(target.pieceValue > piece.pieceValue) {

                        }
                    }
                }

            }

        }


        // If not, make a move for our own benefit


        // Although we don't really know what's happening yet so rekt
        return "";
    }
}
