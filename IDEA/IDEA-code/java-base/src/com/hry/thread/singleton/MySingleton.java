package com.hry.thread.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MySingleton {


    private static MySingleton mySingleton = null;
    private final static ReentrantLock lock = new ReentrantLock();
    private MySingleton(){}
    public static MySingleton getInstance(){
        lock.lock();
        if (mySingleton == null){
            synchronized (MySingleton.class){
                if (mySingleton == null){
                    mySingleton = new MySingleton();
                }
            }
        }
        lock.unlock();
        return mySingleton;
    }

}
