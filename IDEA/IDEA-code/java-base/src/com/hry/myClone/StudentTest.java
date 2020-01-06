package com.hry.myClone;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * 对学生类的测试
 * @author junehappylove
 *
 */
public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test//测试Student/Teacher的深层克隆方法
    public void testClone() {
        Teacher june = new Teacher("june", 30);
        Student xiaoming = new Student("xiaoming", 15, june);
        //小红是由小明克隆的
        Student xiaohong = (Student) xiaoming.clone();
        //此时两个学生的老师可不是同一个人，虽然名字和年龄都相同，注意了！
        assertFalse(xiaoming.getTeacher().equals(xiaohong.getTeacher()));
        //相等方法不用 == 判断，这两个对象的引用地址明显是不同的
        assertFalse(xiaoming.getTeacher() == xiaohong.getTeacher());
        // 假设学生小红的教师变了
        Teacher judy = new Teacher("judy", 28);
        xiaohong.setTeacher(judy);
        // 而小红使用小明克隆的，那么小明的老师是否也跟着变化了呢？
        // 如果小明的老师也变了，那么说明学生Student这个类的clone方法是浅复制的
        // 如果小明的老师仍然是june，那么说明Student这个类的clone方法是深复制的
        // 这里参考Student的clone方法，可知学生类是一个深复制
        assertFalse(xiaoming.getTeacher().equals(xiaohong.getTeacher()));
    }

}
