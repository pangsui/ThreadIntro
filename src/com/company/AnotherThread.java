package com.company;

import static com.company.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from "+getName());

        try{
            System.out.println("Going to sleep, please wait");
            Thread.sleep(3000);

        }catch (InterruptedException e  ){
            System.out.println("Another thread got me up");
            return;
        }
        System.out.println("I have finished and I am awake");
    }

}
