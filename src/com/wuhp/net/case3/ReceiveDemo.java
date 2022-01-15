package com.wuhp.net.case3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP 接收数据
 * 因为接收端不知道发送端什么时候停止发送，采用死循环接收数据
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("receive start at port 12345");
        DatagramSocket ds = new DatagramSocket(12345);

        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            ds.receive(dp);

            System.out.println("接收到的数据 = " + new String(dp.getData(), 0, dp.getLength()));

            // ds.close();
            // System.out.println("close receive")
        }
    }
}
