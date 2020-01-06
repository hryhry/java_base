package com.hry.io;

import java.io.*;

public class FileInputStreamIO {
    InputStream fis;
    OutputStream fos;

    {
        try {
            fis = new FileInputStream("E:/abc.txt");
            fos = new FileOutputStream("E:/cde.txt");
            int len;
            byte[] temp = new byte[1024];
            while ((len=fis.read(temp)) != -1){
                fos.write(temp, 0, len);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
