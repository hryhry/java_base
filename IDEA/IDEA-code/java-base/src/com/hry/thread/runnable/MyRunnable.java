package com.hry.thread.runnable;

public class MyRunnable implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
