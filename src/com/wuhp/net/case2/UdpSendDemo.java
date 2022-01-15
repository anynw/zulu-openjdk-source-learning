package com.wuhp.net.case2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class UdpSendDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("udp send start");
        //创建 socket 对象
        DatagramSocket ds = new DatagramSocket();
        //创建连接，打包数据
        // 数据包
        String msg = "hello world";
        DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, InetAddress.getByName("localhost"), 10086);
        //发送数据
        ds.send(dp);
        //关闭
        ds.close();

        System.out.println("udp send end");
    }
}
