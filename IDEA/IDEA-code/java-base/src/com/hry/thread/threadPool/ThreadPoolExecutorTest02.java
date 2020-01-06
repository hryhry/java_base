package com.hry.thread.threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest02 {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 0,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(512),
                new ThreadPoolExecutor.DiscardPolicy());
        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

}
