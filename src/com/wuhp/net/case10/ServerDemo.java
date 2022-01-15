package com.wuhp.net.case10;

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
        while ((line = br.readLine()) != null) {//等待读取数据，并不知道客户端什么时候读取完毕数据
            // if ("886".equals(line)){
            //     break;
            // }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        System.out.println("server");

        //给出反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        //释放文件资源
        bw.close();
        socket.close();
    }
}
