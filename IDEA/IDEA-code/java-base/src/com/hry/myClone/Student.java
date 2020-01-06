package com.hry.myClone;

/**
 * 学生类
 * @author junehappylove
 *
 */
public class Student extends Person implements Cloneable {

    private static final long serialVersionUID = 19880316L;

    private Teacher teacher;//学生的老师

    public Student(String name, int age, Teacher teacher){
        super();
        super.setName(name);
        super.setAge(age);
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public Object clone(){
        Student o = null;
        try {
            o = (Student)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }//上面已经可以做到浅层克隆了，深层克隆就需要解决学生的老师对象
        o.setTeacher((Teacher)getTeacher().clone());//这里设置一下教师的克隆对象即可
        return o;
    }
}
