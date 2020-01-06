package com.hry.thread.thread;

import java.util.concurrent.Callable;

public class MyCallable<S> implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("succeed");
        return "String";
    }
}
