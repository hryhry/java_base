package com.hry.thread.callable;

import java.util.concurrent.Callable;

//  Callable<String>
//  Callable接口接受一个泛型作为接口中call方法的返回值类型
public class MyCallable<String> implements Callable<String> {

    private volatile int tickt=10;

    @Override
    public String call() throws Exception {
        // TODO Auto-generated method stub
        String result;
        while(tickt>0) {
            System.out.println(Thread.currentThread().getName() +"票还剩余："+tickt);
            tickt--;
        }
        result=(String) "票已卖光";
        return result;
    }

}
