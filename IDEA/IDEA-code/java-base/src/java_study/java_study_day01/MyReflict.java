package java_study.java_study_day01;

import java.util.HashMap;

public class MyReflict {
    public static void main(String[] args) throws ClassNotFoundException {
        MyInteger myInteger = new MyInteger();
        Class clazz = myInteger.getClass();
        Class<?> aClass = Class.forName("");
        Class aClass1 = ClassLoader.getSystemClassLoader().loadClass("java_study.java_study_day01.MyInteger");


    }
}
