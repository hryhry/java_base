package com.hry.myClassLoader;

public class test {
    static {
        System.out.println("***************static code******************");
    }

    public static void main(String[] args) {
        new A();
        System.out.println("**************load test*************");
        new B();
        System.out.println(Runtime.getRuntime());
    }
}
