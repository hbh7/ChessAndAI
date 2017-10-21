package com.hbh7;

public class Main {

    public static void main(String[] args) throws InterruptedException {

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

        Bishop whiteBishop1 = new Bishop("White");
        Bishop whiteBishop2 = new Bishop("White");
        Bishop blackBishop1 = new Bishop("Black");
        Bishop blackBishop2 = new Bishop("Black");

        Rook whiteRook1 = new Rook("White");
        Rook whiteRook2 = new Rook("White");
        Rook blackRook1 = new Rook("Black");
        Rook blackRook2 = new Rook("Black");

        Knight whiteKnight1 = new Knight("White");
        Knight whiteKnight2 = new Knight("white");
        Knight blackKnight1 = new Knight("Black");
        Knight blackKnight2 = new Knight("Black");

        Queen whiteQueen1 = new Queen("White");
        Queen whiteQueen2 = new Queen("White");

        King blackKing1 = new King("Black");
        King blackKing2 = new King("Black");

        Pawn whitePawn1 = new Pawn("White");
        Pawn whitePawn2 = new Pawn("white");
        Pawn whitePawn3 = new Pawn("White");
        Pawn whitePawn4 = new Pawn("white");
        Pawn whitePawn5 = new Pawn("White");
        Pawn whitePawn6 = new Pawn("white");
        Pawn whitePawn7 = new Pawn("White");
        Pawn whitePawn8 = new Pawn("white");
        Pawn blackPawn1 = new Pawn("Black");
        Pawn blackPawn2 = new Pawn("Black");
        Pawn blackPawn3 = new Pawn("Black");
        Pawn blackPawn4 = new Pawn("Black");
        Pawn blackPawn5 = new Pawn("Black");
        Pawn blackPawn6 = new Pawn("Black");
        Pawn blackPawn7 = new Pawn("Black");
        Pawn blackPawn8 = new Pawn("Black");
        
        // Debug/testing
        System.out.println(blackBishop1.printInfo());

    }
}
