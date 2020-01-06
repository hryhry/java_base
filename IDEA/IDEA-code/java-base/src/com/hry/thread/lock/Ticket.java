package com.hry.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
   int ticket = 100;
   Lock lock = new ReentrantLock();
   @Override
    public void run() {
        //模拟买票
       while (true){
           lock.lock();
           if (ticket>0){
               try {
                   Thread.sleep(10);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println(Thread.currentThread().getName() + "正在卖票:" + ticket--);
           }
           lock.unlock();
       }
    }
}
