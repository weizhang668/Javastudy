package com.banyuan.example.udp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Auther: 张伟
 * @Date: 2019/11/8
 * @Description: com.banyuan.example.UDp
 * @version: 1.0
 */
public class InetAddress01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress adr=InetAddress.getLocalHost();
        System.out.println(adr.getHostAddress());
        System.out.println(adr.getHostName());

    }
}
