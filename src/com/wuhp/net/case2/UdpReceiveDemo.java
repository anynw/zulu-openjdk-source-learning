package com.wuhp.net.case2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.Charset;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class UdpReceiveDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("udp receive start");
        DatagramSocket ds = new DatagramSocket(10086);
        //创建接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        //接收
        ds.receive(dp);
        //解析数据包
        byte[] data = dp.getData();
        //返回要发送的数据的长度
        String msg = new String(data, 0, dp.getLength());
        System.out.println("msg = " + msg);


        //关闭
        ds.close();

        System.out.println("udp receive end");

    }
}
