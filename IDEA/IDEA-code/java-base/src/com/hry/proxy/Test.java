package com.hry.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {

        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        HelloInterface hello = new Hello();
        ByeInterface bye = new Bye();

        InvocationHandler handler = new ProxyHandler(hello);
        InvocationHandler handler1 = new ProxyHandler(bye);

        HelloInterface proxyHello = (HelloInterface) Proxy.newProxyInstance(
                                                    //第一个参数 hello.class.getClassLoader()类加载器就只有一个，一个程序中所有类都是公用同一个类加载器，用哪个类的都一样
                                                    HelloInterface.class.getClassLoader(),
                                                    //第二个参数：Porxy（代理类）需要实现什么接口
                                                    hello.getClass().getInterfaces(),
                                                    //第三个参数：通过接口对象调用方法时，需要调用哪个类的invoke方法
                                                    handler
                                                );
        ByeInterface proxyBye = (ByeInterface) Proxy.newProxyInstance(
                                                    ByeInterface.class.getClassLoader(),
                                                    bye.getClass().getInterfaces(),
                                                    handler1
                                                );
        //这里面调代理类的方法，这里其实是调用的ServicePeople类中的invoke方法，
        // invoke方法内还有一个 method.invoke(boss, args)再通过反射调用Boss类中的该方法
        proxyHello.sayHello();
        proxyBye.sayBye();

    }

}
