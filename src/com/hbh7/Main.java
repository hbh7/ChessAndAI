package com.hbh7;

import java.util.Scanner;
import static com.hbh7.Util.*;

public class Main {

    public static void main(String[] args) {

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

        ChessPiece whiteBishop1 = new Bishop("White", "A3");
        ChessPiece whiteBishop2 = new Bishop("White", "A6");
        ChessPiece blackBishop1 = new Bishop("Black", "H3");
        ChessPiece blackBishop2 = new Bishop("Black", "H6");

        ChessPiece whiteRook1 = new Rook("White", "A1");
        ChessPiece whiteRook2 = new Rook("White", "A8");
        ChessPiece blackRook1 = new Rook("Black", "H1");
        ChessPiece blackRook2 = new Rook("Black", "H8");

        ChessPiece whiteKnight1 = new Knight("White", "A2");
        ChessPiece whiteKnight2 = new Knight("White", "A7");
        ChessPiece blackKnight1 = new Knight("Black", "H2");
        ChessPiece blackKnight2 = new Knight("Black", "H7");

        ChessPiece whiteQueen1 = new Queen("White", "A4");
        ChessPiece blackQueen1 = new Queen("Black", "H4");

        ChessPiece whiteKing1 = new King("White", "A5");
        ChessPiece blackKing1 = new King("Black", "H5");

        ChessPiece whitePawn1 = new Pawn("White", "B1");
        ChessPiece whitePawn2 = new Pawn("White", "B2");
        ChessPiece whitePawn3 = new Pawn("White", "B3");
        ChessPiece whitePawn4 = new Pawn("White", "B4");
        ChessPiece whitePawn5 = new Pawn("White", "B5");
        ChessPiece whitePawn6 = new Pawn("White", "B6");
        ChessPiece whitePawn7 = new Pawn("White", "B7");
        ChessPiece whitePawn8 = new Pawn("White", "B8");
        ChessPiece blackPawn1 = new Pawn("Black", "G1");
        ChessPiece blackPawn2 = new Pawn("Black", "G2");
        ChessPiece blackPawn3 = new Pawn("Black", "G3");
        ChessPiece blackPawn4 = new Pawn("Black", "G4");
        ChessPiece blackPawn5 = new Pawn("Black", "G5");
        ChessPiece blackPawn6 = new Pawn("Black", "G6");
        ChessPiece blackPawn7 = new Pawn("Black", "G7");
        ChessPiece blackPawn8 = new Pawn("Black", "G8");

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

        beginGame(boardArray);

    }

    private static void beginGame(ChessPiece[][] boardArray) {
        System.out.println("Welcome to Chess!");
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        boolean validInput = false;
        while(!validInput) {
            System.out.print("1 Player or 2? ");
            input = scanner.nextInt();
            scanner.nextLine();
            if(input == 1 || input == 2) {
                validInput = true;
            } else {
                System.out.println("Invalid input! Please enter 1 or 2.");
            }
        }
        if(input == 1){
            String input2 = "";
            validInput = false;
            while(!validInput) {
                System.out.print("1 Player mode selected. Use built in AI? [yes, no] ");
                input2 = scanner.nextLine();
                if(input2.toLowerCase().equals("yes") || input2.toLowerCase().equals("no")) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input! Please try again!");
                }
            }

            if(input2.toLowerCase().equals("yes")){
                System.out.println("Lovely! Beginning game!");
                gameLoopAI(boardArray);
            } else if (input2.toLowerCase().equals("no")) {
                System.out.println("Well that's unfortunate, because that's not implemented yet. Beginning game with built in AI!");
                gameLoopAI(boardArray);
            } else {
                System.out.println("I'm not really sure what that meant. Assuming you answered yes instead! Beginning game!");
                gameLoopAI(boardArray);
            }
        } else if (input == 2) {
            System.out.println("2 Player mode selected. Player 1 is white, and player 2 is black. Beginning Game!");
            gameLoop2P(boardArray);
        } else {
            System.out.println("Invalid option!");
        }


    }

    private static void gameLoop2P(ChessPiece[][] boardArray) {
        boolean gameWon = false;
        int playerNum = 1;

        while(!gameWon) {
            drawGameBoard(boardArray);

            if(playerNum == 1)
                System.out.println("Ready Player One (White)");
            else
                System.out.println("Ready Player Two (Black)");

            boolean moveSucceeded = false;
            while (!moveSucceeded) {
                if(doPlayerInput(playerNum, boardArray))
                    moveSucceeded = true;
            }

            if (playerNum == 1) {
                playerNum = 2;
            } else {
                playerNum = 1;
            }

        }
    }

    private static void gameLoopAI(ChessPiece[][] boardArray) {
        boolean gameWon = false;
        int playerNum = 1;
        AI ai = new AI(1);

        while(!gameWon) {
            drawGameBoard(boardArray);

            if(playerNum == 1) {
                System.out.println("Ready Player One (White)");
                boolean moveSucceeded = false;
                while (!moveSucceeded) {
                    if (doPlayerInput(playerNum, boardArray))
                        moveSucceeded = true;
                }
                playerNum = 2;
            } else {
                System.out.println("AI is playing...");
                ai.doTurn(boardArray);
                playerNum = 1;
            }

        }
    }

    private static boolean doPlayerInput(int playerNum, ChessPiece[][] boardArray) {

        // Bugs:
        // 2nd number could be double (or more) digits and it just takes the first, no error. Perhaps same for 1st num.
        // Program crashes if attempting to move nonexistent piece.

        System.out.print("Enter an action: [Format: A2 to A3] ");
        Scanner scanner = new Scanner(System.in);

        String playerMove = scanner.nextLine();

        String[] stringParts = playerMove.split(" to ");

        String originalPos = stringParts[0];
        String newPos = stringParts[1];

        String[] originalPosSplit = originalPos.split("");
        String[] newPosSplit = newPos.split("");

        int originalRow = Integer.parseInt(originalPosSplit[1]);
        String originalColumn = originalPosSplit[0].toUpperCase();
        int newRow = Integer.parseInt(newPosSplit[1]);
        String newColumn = newPosSplit[0].toUpperCase();

        if(boardArray[toArrayIndex(originalRow)][toArrayIndex(originalColumn)].checkValidMove(playerNum, originalRow, originalColumn, newRow, newColumn, boardArray)) {
            boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)] = boardArray[toArrayIndex(originalRow)][toArrayIndex(originalColumn)];
            boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)].setPosition(toArrayIndex(originalRow), toArrayIndex(originalColumn));
            boardArray[toArrayIndex(originalRow)][toArrayIndex(originalColumn)] = null;
            if((toArrayIndex(newRow) == 0 || toArrayIndex(newRow) == 7) && boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)].getPieceType().equals("Pawn")){
                System.out.print("Pawn has reached end of board! Please select a new piece: [Queen, Rook, Knight, Bishop] ");
                String input = scanner.nextLine();
                String owner;
                if(playerNum == 1)
                    owner = "White";
                else
                    owner = "Black";
                String space = newRow + newColumn;
                switch (input.replaceAll("\\s+","").toLowerCase()) {
                    case ("queen"):
                        boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)] = new Queen(owner, space);
                        break;
                    case ("rook"):
                        boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)] = new Rook(owner, space);
                        break;
                    case ("knight"):
                        boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)] = new Knight(owner, space);
                        break;
                    case ("bishop"):
                        boardArray[toArrayIndex(newRow)][toArrayIndex(newColumn)] = new Bishop(owner, space);
                        break;
                }
            }
            return true;
        } else {
            System.out.println("Please try again.");
            return false;
        }

    }

    private static void drawGameBoard(ChessPiece[][] boardArray) {
        // well this might be hard, good luck future self!!!

        System.out.println("  |       A       |       B       |       C       |       D       |       E       |       F       |       G       |       H       |");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < 8; i++) {
            System.out.println("  |                                                                                                                               |");
            System.out.print((i+1) + " | ");
            for (int k = 0; k < 8; k++) {
                if (boardArray[i][k] == null) {
                    System.out.print("             " + " | ");
                } else {
                    System.out.print(boardArray[i][k].displayPiece() + " | ");
                }
            }
            System.out.println();
            System.out.println("  |                                                                                                                               |");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        }

    }
}


















