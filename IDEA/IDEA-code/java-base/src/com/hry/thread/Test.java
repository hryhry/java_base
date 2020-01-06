package com.hry.thread;

import com.hry.thread.runnable.MyRunnable;
import com.hry.thread.thread.MyThread;
import com.sun.imageio.stream.StreamFinalizer;

import static java.lang.Thread.yield;

public class Test {
    public static void main(String[] args) {


    }


    public static void testRunnable() throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        //将该线程设置为守护线程
        thread.setDaemon(true);
        thread.start();
        //获取线程的名字
        System.out.println(thread.getName());
        //获取线程的优先级
        int priority = thread.getPriority();
        System.out.println(priority);
        thread.setPriority(7);
        thread.sleep(1000);
        yield();
    }

    public static void testThread(String threadName){
        MyThread myThread = new MyThread(threadName);
        myThread.start();
    }
}
