package com.hbh7;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Chess!");

        ChessPiece whiteRook1 = new Rook();
        ChessPiece whiteRook2 = new Rook();
        ChessPiece blackRook1 = new Rook();
        ChessPiece blackRook2 = new Rook();

        whiteRook1.owner = "White";
        whiteRook2.owner = "White";
        blackRook1.owner = "Black";
        blackRook2.owner = "Black";

        ChessPiece whiteKnight1 = new Knight();
        ChessPiece whiteKnight2 = new Knight();
        ChessPiece blackKnight1 = new Knight();
        ChessPiece blackKnight2 = new Knight();

        whiteKnight1.owner = "White";
        whiteKnight2.owner = "White";
        blackKnight1.owner = "Black";
        blackKnight2.owner = "Black";

        // Debug/testing
        System.out.println(whiteRook1.printInfo());

    }
}
