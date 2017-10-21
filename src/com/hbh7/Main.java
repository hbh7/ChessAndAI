package com.hbh7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to Chess!");

        /* Board Layout
        
        A1 A2 A3 A4 A5 A6 A7 A8
        B1 B2 B3 B4 B5 B6 B7 B8
        C1 C2 C3 C4 C5 C6 C7 C8
        D1 D2 D3 D4 D5 D6 D7 D8
        E1 E2 E3 E4 E5 E6 E7 E8
        F1 F2 F3 F4 F5 F6 F7 F8
        G1 G2 G3 G4 G5 G6 G7 G8
        H1 H2 H3 H4 H5 H6 H7 H8
               
         */

        ChessPiece whiteBishop1 = new ChessPiece("Bishop","White", "A3");
        ChessPiece whiteBishop2 = new ChessPiece("Bishop","White", "A6");
        ChessPiece blackBishop1 = new ChessPiece("Bishop","Black", "H3");
        ChessPiece blackBishop2 = new ChessPiece("Bishop","Black", "H6");

        ChessPiece whiteRook1 = new ChessPiece("Rook","White", "A1");
        ChessPiece whiteRook2 = new ChessPiece("Rook","White", "A8");
        ChessPiece blackRook1 = new ChessPiece("Rook","Black", "H1");
        ChessPiece blackRook2 = new ChessPiece("Rook","Black", "H8");

        ChessPiece whiteKnight1 = new ChessPiece("Knight","White", "A2");
        ChessPiece whiteKnight2 = new ChessPiece("Knight","white", "A7");
        ChessPiece blackKnight1 = new ChessPiece("Knight","Black", "H2");
        ChessPiece blackKnight2 = new ChessPiece("Knight","Black", "H7");

        ChessPiece whiteQueen1 = new ChessPiece("Queen","White", "A4");
        ChessPiece blackQueen1 = new ChessPiece("Queen","Black", "H4");

        ChessPiece whiteKing1 = new ChessPiece("King","White", "A5");
        ChessPiece blackKing1 = new ChessPiece("King","Black", "H5");

        ChessPiece whitePawn1 = new ChessPiece("Pawn","White", "B1");
        ChessPiece whitePawn2 = new ChessPiece("Pawn","white", "B2");
        ChessPiece whitePawn3 = new ChessPiece("Pawn","White", "B3");
        ChessPiece whitePawn4 = new ChessPiece("Pawn","white", "B4");
        ChessPiece whitePawn5 = new ChessPiece("Pawn","White", "B5");
        ChessPiece whitePawn6 = new ChessPiece("Pawn","white", "B6");
        ChessPiece whitePawn7 = new ChessPiece("Pawn","White", "B7");
        ChessPiece whitePawn8 = new ChessPiece("Pawn","white", "B8");
        ChessPiece blackPawn1 = new ChessPiece("Pawn","Black", "G1");
        ChessPiece blackPawn2 = new ChessPiece("Pawn","Black", "G2");
        ChessPiece blackPawn3 = new ChessPiece("Pawn","Black", "G3");
        ChessPiece blackPawn4 = new ChessPiece("Pawn","Black", "G4");
        ChessPiece blackPawn5 = new ChessPiece("Pawn","Black", "G5");
        ChessPiece blackPawn6 = new ChessPiece("Pawn","Black", "G6");
        ChessPiece blackPawn7 = new ChessPiece("Pawn","Black", "G7");
        ChessPiece blackPawn8 = new ChessPiece("Pawn","Black", "G8");

        // idk its probably better than nothing. starting point ¯\_(ツ)_/¯

        int width = 8;
        int height = 8;
        int totalPieces = width * height;

        ChessPiece[][] boardArray = new ChessPiece[width][height];

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

    public static void gameLoop (ChessPiece[][] boardArray) {
        boolean gameIsWon = false;
        int playerNum = 1;

        while(gameIsWon == false) {
            drawGameBoard(boardArray);

            tryPlayerInput(playerNum, boardArray);


            if (playerNum == 1) {
                playerNum = 2;
            } else {
                playerNum = 1;
            }

        }
    }

    public static String tryPlayerInput (int playerNum, ChessPiece[][] boardArray) {
        Scanner scanner = new Scanner(System.in);

        String playerMove = scanner.next();

        String[] stringParts = playerMove.split(" to ");

        String originalPos = stringParts[0];
        String newPos = stringParts[1];

        String[] arrayTemp = originalPos.split("");
        String row = arrayTemp[0];
        String column = arrayTemp[1];
        switch(row){
            case "A":
                
        }


    }

    public static void drawGameBoard (ChessPiece[][] boardArray) {
        // well this might be hard, good luck future self!!!

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 8; i++) {
            System.out.println("|                                                                                                                               |");
            System.out.print("| ");
            for (int k = 0; k < 8; k++) {
                if (boardArray[i][k] == null) {
                    System.out.print(" Empty Space " + " | ");
                } else {
                    System.out.print(boardArray[i][k].displayPiece() + " | ");
                }
            }
            System.out.println();
            System.out.println("|                                                                                                                               |");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        }

    }
}


















