package com.wuhp.net.case11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器：接收到的数据写入文本文件，给出反馈，使用线程封装，为每一个客户端开启一个线程
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);

        while (true) {
            //监听
            Socket socket = serverSocket.accept();
            //为每一个客户端开启一个线程
            new Thread(new ServerThread(socket)).start();
        }
    }
}
