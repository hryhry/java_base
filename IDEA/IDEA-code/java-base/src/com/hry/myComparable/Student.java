package com.hry.myComparable;

public class Student implements Comparable<Student> {

    private int sid; //学号
    private String sname; //姓名
    private double score; //分数

    public Student() {
    }

    public Student(int sid, String sname, double score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
    }

    @Override
    public int compareTo(Student s) {
        if(this.score>s.getScore()){
            return 1; //正整数是大于
        }else if(this.score<s.getScore()){
            return -1;//负整数是小于
        }else{
            return 0; //0为等于
        }
    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", score=" + score +
                '}';
    }
}
