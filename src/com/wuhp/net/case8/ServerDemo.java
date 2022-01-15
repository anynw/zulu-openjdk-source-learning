package com.wuhp.net.case8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器：接收到的数据写入文件
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        //监听
        Socket socket = serverSocket.accept();

        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("msg2.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //释放文件资源
        bw.close();
        socket.close();
    }
}
