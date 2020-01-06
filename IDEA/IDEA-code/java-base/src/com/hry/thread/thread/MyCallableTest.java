package com.hry.thread.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable<String> myCallable = new MyCallable<String>();
        FutureTask<String> futureTask = new FutureTask<String>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.run();
        System.out.println(futureTask.get());

    }
}
