package com.hry.myRefliect;

import java.lang.reflect.Method;

public class Fields {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1.获取Class对象
        Class clazz = Class.forName("com.hry.myRefliect.Student");
        // 2.获取所有公有方法
        Method[] methods = clazz.getMethods();

    }
}
