package com.company;

import static com.company.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE +"Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_RED+ "Hello from an anonymous thread");
            }
        }.start();
        System.out.println(ANSI_CYAN+ "Hello again from main thread");

        Thread myRunnable = new Thread(new MyRunnable()){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from my runnable implementation override");
                try{
                   anotherThread.join();
                    System.out.println(ANSI_RED +"Another thread terminated, so I am running again");
                }catch ( InterruptedException e ){
                    System.out.println(ANSI_GREEN + "I couldn't wait at all, I was interrupted by another thread");
                }
            }
        };
        myRunnable.start();

    }
}
