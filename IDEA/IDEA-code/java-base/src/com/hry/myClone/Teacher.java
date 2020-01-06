package com.hry.myClone;

/**
 * 教师类
 * @author junehappylove
 *
 */
public class Teacher extends Person implements Cloneable {

    private static final long serialVersionUID = 19880316L;

    public Teacher(String name, int age){
        super();
        super.setName(name);
        super.setAge(age);
    }

    @Override
    public Object clone(){
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }
}
