package com.hry.myRefliect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Constructors {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.加载Class对象
        Class clazz = Class.forName("com.hry.myRefliect.Student");

        // 2.获取所有共有的构造方法
        System.out.println("**********************所有公有构造方法*********************************");
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        System.out.println("**********************所有的构造方法(包括：私有、受保护、默认、公有)*********************************");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor constructor = clazz.getConstructor(null);
        System.out.println(constructor);

        System.out.println("******************获取私有构造方法，并调用*******************************");
        Constructor con = clazz.getDeclaredConstructor(char.class);
        System.out.println(con);

        //调用构造方法
        con.setAccessible(true);
        Student stu = (Student) con.newInstance('男');


    }
}
