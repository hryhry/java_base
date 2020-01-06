package com.hry.internet;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress[] address_1 = InetAddress.getAllByName("www.baidu.com");

        for (InetAddress inetAddress : address_1){
            System.out.println(inetAddress);
            //获取InetAdderss对象所含的域名
            System.out.println(inetAddress.getHostName());
            //获取InetAddress对象所含的IP地址
            System.out.println(inetAddress.getHostAddress());
            System.out.println("==============================");
        }

        //获取本机的域名和iP和IP地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);


    }
}
