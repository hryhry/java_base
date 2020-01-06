package com.hry.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class myInputStream {

    public static void main(String[] args) {

    }
    public static void copyFileInputStream() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(""));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(""));
        int len;
        while ((len = fileInputStream.read()) != -1){
            fileOutputStream.write(len);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.close();
    }

    public static void copyFileInputStreamByByte() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(""));
        FileOutputStream fileOutputStream = new FileOutputStream(new File(""));
        int len;
        byte[] bs = new byte[1024];
        while ((len = fileInputStream.read(bs)) != -1){
            fileOutputStream.write(bs);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.close();
    }
    public static void copyFileInputStreamByBuffer() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(""));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        FileOutputStream fileOutputStream = new FileOutputStream(new File(""));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        int len;
        byte[] bs = new byte[1024];
        while ((len = bufferedInputStream.read(bs)) != -1){
            bufferedOutputStream.write(bs);
        }
        bufferedOutputStream.flush();

        bufferedOutputStream.close();
        bufferedInputStream.close();
        fileOutputStream.close();
        fileInputStream.close();
    }

    public static void copyFileReader() throws IOException {
        FileReader fileReader = new FileReader(new File(""));
        FileWriter fileWriter = new FileWriter(new File(""));
        int len ;
        while ((len = fileReader.read()) != -1){
            fileWriter.write(len);
        }
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
    }
    public static void copyFileReaderByChar() throws IOException {
        FileReader fileReader = new FileReader(new File(""));
        FileWriter fileWriter = new FileWriter(new File(""));
        int len ;
        char[] chars = new char[1024];
        while ((len = fileReader.read(chars)) != -1){
            fileWriter.write(chars);
        }
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
    }

    public static void copyFileReaderByBuffer() throws IOException {
        FileReader fileReader = new FileReader(new File(""));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(new File(""));
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        int len ;
        char[] chars = new char[1024];
        while ((len = bufferedReader.read(chars)) != -1){
            bufferedWriter.write(chars);
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
        fileWriter.close();
        fileReader.close();
    }

}
