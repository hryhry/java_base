package java_study.java_study_day01;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MyInteger {


    public static void main(String[] args) throws FileNotFoundException {

    }

    public static void readToWrite() throws IOException {
        FileInputStream inputStream = new FileInputStream("f://滑板//HEEL_FLIP.mp4");
        FileOutputStream outputStream = new FileOutputStream("HEEL_FLIP.mp4");
        int len;
        while ((len = inputStream.read()) != -1) {
            outputStream.write(len);
        }
        inputStream.close();
        outputStream.close();
    }

    public static void readToWrite01() throws IOException {
        FileInputStream inputStream = new FileInputStream("f://滑板//HEEL_FLIP.mp4");
        FileOutputStream outputStream = new FileOutputStream("HEEL_FLIP.mp4");
        int len;
        byte[] bs = new byte[1024];
        // 一次读取一个字节数组
        while ((len = inputStream.read(bs)) != -1) {
            outputStream.write(bs, 0, len);
        }
        inputStream.close();
        outputStream.close();
    }

    public static void readToWrite02() throws IOException {
        FileInputStream inputStream = new FileInputStream("f://滑板//HEEL_FLIP.mp4");
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        FileOutputStream outputStream = new FileOutputStream("HEEL_FLIP.mp4");
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        int len;
        byte[] bs = new byte[1024];
        while ((len = bis.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
        bis.close();
        bos.close();
    }

    public static void readToWrite03() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(""));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(""));

        int i;
        while((i=inputStreamReader.read())!= -1){
            outputStreamWriter.write(i);
        }
        outputStreamWriter.flush();
        outputStreamWriter.close();
        inputStreamReader.close();
    }

    public static void readToWrite04() throws IOException {
        //创建输入流对象
        BufferedReader br=new BufferedReader(new FileReader("C:\\Test\\copyfrom.txt"));//文件不存在会抛出java.io.FileNotFoundException
        //创建输出流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Test\\copyto.txt"));
        //文本文件复制
        char [] chs=new char[1024];
        int len=0;
        while((len=br.read(chs))!=-1) {
            bw.write(chs, 0, len);
        }
        //释放资源
        br.close();
        bw.close();
    }
    /*
    * readLine()
    * */
    public static void readToWrite05() throws IOException {
        //创建输入流对象
        BufferedReader br=new BufferedReader(new FileReader("C:\\Test\\copyfrom.txt"));//文件不存在会抛出java.io.FileNotFoundException
        //创建输出流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Test\\copyto.txt"));
        //文本文件复制
        String a;
        int len=0;
        while((a=br.readLine())!=null) {
            bw.write(a);
        }
        bw.flush();
        //释放资源
        br.close();
        bw.close();
    }
}
