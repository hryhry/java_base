package com.hry.myClone;

import java.io.Serializable;

/**
 * 抽象类--人
 * @author junehappylove
 *
 */
public abstract class Person implements Serializable {

    private static final long serialVersionUID = 19880316L;

    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}


