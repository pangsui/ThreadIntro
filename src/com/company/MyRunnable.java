package com.company;
import static com.company.ThreadColor.ANSI_GREEN;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "Hello from my runnable implementation ");
    }
}
