package com.hbh7;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Chess!");


        ChessPiece rook = new Rook();

        rook.owner = "White";

        System.out.println(rook.printInfo());

    }
}
