package com.hbh7;

public class Util {

    public static int toArrayIndex(int pos) {
        return pos - 1;
    }

    public static int toArrayIndex(String pos){
        // A: 65
        char c = pos.toUpperCase().toCharArray()[0];
        return ((int) c ) - 65;
    }

    public static String convertToLetter(int pos){
        return Character.toString((char) (pos + 65));
    }

}
