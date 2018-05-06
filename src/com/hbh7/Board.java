package com.hbh7;

public class Board {

    private ChessPiece boardArray[][];

    public Board(int width, int height) {
        boardArray = new ChessPiece[width][height];
        ChessPiece whiteBishop1 = new Bishop("Bishop","White", "A3");
        ChessPiece whiteBishop2 = new Bishop("Bishop","White", "A6");
        ChessPiece blackBishop1 = new Bishop("Bishop","Black", "H3");
        ChessPiece blackBishop2 = new Bishop("Bishop","Black", "H6");

        ChessPiece whiteRook1 = new Rook("Rook","White", "A1");
        ChessPiece whiteRook2 = new Rook("Rook","White", "A8");
        ChessPiece blackRook1 = new Rook("Rook","Black", "H1");
        ChessPiece blackRook2 = new Rook("Rook","Black", "H8");

        ChessPiece whiteKnight1 = new Knight("Knight","White", "A2");
        ChessPiece whiteKnight2 = new Knight("Knight","white", "A7");
        ChessPiece blackKnight1 = new Knight("Knight","Black", "H2");
        ChessPiece blackKnight2 = new Knight("Knight","Black", "H7");

        ChessPiece whiteQueen1 = new Queen("Queen","White", "A4");
        ChessPiece blackQueen1 = new Queen("Queen","Black", "H4");

        ChessPiece whiteKing1 = new King("King","White", "A5");
        ChessPiece blackKing1 = new King("King","Black", "H5");

        ChessPiece whitePawn1 = new Pawn("White", "B1");
        ChessPiece whitePawn2 = new Pawn("White", "B2");
        ChessPiece whitePawn3 = new Pawn("White", "B3");
        ChessPiece whitePawn4 = new Pawn("White", "B4");
        ChessPiece whitePawn5 = new Pawn("White", "B5");
        ChessPiece whitePawn6 = new Pawn("White", "B6");
        ChessPiece whitePawn7 = new Pawn("White", "B7");
        ChessPiece whitePawn8 = new Pawn("white", "B8");
        ChessPiece blackPawn1 = new Pawn("Black", "G1");
        ChessPiece blackPawn2 = new Pawn("Black", "G2");
        ChessPiece blackPawn3 = new Pawn("Black", "G3");
        ChessPiece blackPawn4 = new Pawn("Black", "G4");
        ChessPiece blackPawn5 = new Pawn("Black", "G5");
        ChessPiece blackPawn6 = new Pawn("Black", "G6");
        ChessPiece blackPawn7 = new Pawn("Black", "G7");
        ChessPiece blackPawn8 = new Pawn("Black", "G8");

        boardArray[0][0] = whiteRook1;
        boardArray[0][1] = whiteKnight1;
        boardArray[0][2] = whiteBishop1;
        boardArray[0][3] = whiteQueen1;
        boardArray[0][4] = whiteKing1;
        boardArray[0][5] = whiteBishop2;
        boardArray[0][6] = whiteKnight2;
        boardArray[0][7] = whiteRook2;

        boardArray[1][0] = whitePawn1;
        boardArray[1][1] = whitePawn2;
        boardArray[1][2] = whitePawn3;
        boardArray[1][3] = whitePawn4;
        boardArray[1][4] = whitePawn5;
        boardArray[1][5] = whitePawn6;
        boardArray[1][6] = whitePawn7;
        boardArray[1][7] = whitePawn8;

        boardArray[6][0] = blackPawn1;
        boardArray[6][1] = blackPawn2;
        boardArray[6][2] = blackPawn3;
        boardArray[6][3] = blackPawn4;
        boardArray[6][4] = blackPawn5;
        boardArray[6][5] = blackPawn6;
        boardArray[6][6] = blackPawn7;
        boardArray[6][7] = blackPawn8;

        boardArray[7][0] = blackRook1;
        boardArray[7][1] = blackKnight1;
        boardArray[7][2] = blackBishop1;
        boardArray[7][3] = blackQueen1;
        boardArray[7][4] = blackKing1;
        boardArray[7][5] = blackBishop2;
        boardArray[7][6] = blackKnight2;
        boardArray[7][7] = blackRook2;

        for (int i = 2; i < 6; i++) {
            for (int k = 0; k < 8; k++) {
                boardArray[i][k] = null;
            }
        }
    }


    public void setWBishop1Pos(String position){

    }
    public void getWBishop1Pos(){

    }



}
