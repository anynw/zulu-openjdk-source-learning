package com.wuhp.net.case3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("send start");
        DatagramSocket ds = new DatagramSocket();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if ("996".equals(line)) {
                break;
            }
            //创建数据，打包
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("localhost"), 12345);

            ds.send(dp);
        }

        br.close();
        ds.close();
    }
}
