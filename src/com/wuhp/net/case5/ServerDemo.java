package com.wuhp.net.case5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        //监听
        Socket socket = serverSocket.accept();

        //获取输入流
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String msg = new String(bytes, 0, len);
        System.out.println("server: " + msg);


        //给出反馈
        OutputStream os = socket.getOutputStream();
        os.write("data have riceived".getBytes());

        socket.close();
    }
}
