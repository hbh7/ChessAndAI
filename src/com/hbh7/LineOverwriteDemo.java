package com.hbh7;

import java.util.concurrent.TimeUnit;

public class LineOverwriteDemo {

    public static void main(String[] args) throws InterruptedException {

        System.out.print("Hello!");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("\rtesting!");

    }
}
