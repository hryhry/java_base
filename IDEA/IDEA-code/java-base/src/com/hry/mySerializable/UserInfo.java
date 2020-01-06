package com.hry.mySerializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//实现Externalizable接口序列化
public class UserInfo implements Externalizable{
    private String userName;
    private String usePass;
    private int userAge;

    public UserInfo() {
        userAge=20;//这个是在第二次测试使用，判断反序列化是否通过构造器
    }
    public UserInfo(String userName, String usePass, int userAge) {
        super();
        this.userName = userName;
        this.usePass = usePass;
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUsePass() {
        return usePass;
    }
    public void setUsePass(String usePass) {
        this.usePass = usePass;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    @Override
    public String toString() {
        return "UserInfo [userName=" + userName + ", usePass=" + usePass + ",userAge="+(userAge==0?"NOT SET":userAge)+"]";
    }
    public void writeExternal(ObjectOutput out) throws IOException {
        /*
         * 指定序列化时候写入的属性。这里仍然不写入年龄
         */
        out.writeObject(userName);
        out.writeObject(usePass);

    }
    public void readExternal(ObjectInput in) throws IOException,
            ClassNotFoundException {
        /*
         * 指定反序列化的时候读取属性的顺序以及读取的属性
         * 如果你写反了属性读取的顺序，你可以发现反序列化的读取的对象的指定的属性值也会与你写的读取方式一一对应。因为在文件中装载对象是有序的
         */
        userName=(String) in.readObject();
        usePass=(String) in.readObject();
    }


}