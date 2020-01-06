package com.hry.myRefliect;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Student stu = new Student();
        //  方法一
        Class clazz1 = stu.getClass();
        //  方法二
        Class class2 = Student.class;
        //  方法三
        Class clazz3 = Class.forName("com.hry.myRefliect.Student");
        //class.forname()会对类进行初始化，也就是会执行静态代码块
        //loadClass()只是对类进行加载和链接，只有在newInstance()的时候才会对类进行初始化
        Class<?> aClass = ClassLoader.getSystemClassLoader().loadClass("com.hry.myRefliect.Student");
        Object o = aClass.newInstance();
        Student student01 = (Student) o;

        System.out.println(clazz1);
        System.out.println(class2);
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz3);
    }
}
