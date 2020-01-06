package com.hry.thread.sync;

public class myRunnable implements Runnable{
    private static int ticket = 500;

    @Override
    public void run() {
        synchronized (this){
            while (ticket > 0){
                ticket--;
                System.out.println(ticket);
            }
        }
    }
}
