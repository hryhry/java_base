package com.hry.thread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable<String> mc = new MyCallable<>();
        FutureTask<String> futureTask = new FutureTask<String>(mc);
        new Thread(futureTask).start();
        String result = futureTask.get();
        System.out.println(result);
    }
}
