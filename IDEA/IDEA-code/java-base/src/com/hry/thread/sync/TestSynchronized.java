package com.hry.thread.sync;

public class TestSynchronized
{

    public static void main(String[] args)
    {
        myRunnable myRunnable = new myRunnable();
        Thread test1 = new Thread(myRunnable);
        Thread test2 = new Thread(myRunnable);
        Thread test3 = new Thread(myRunnable);
        Thread test4 = new Thread(myRunnable);
        Thread test5 = new Thread(myRunnable);
        test1.start();
        test2.start();
        test3.start();
        test4.start();
        test5.start();
    }

}
