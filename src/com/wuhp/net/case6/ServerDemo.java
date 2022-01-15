package com.wuhp.net.case6;

import java.io.*;
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

        //获取输入流，字节输入流
        // InputStream is = socket.getInputStream();
        // InputStreamReader isr = new InputStreamReader(is);
        // BufferedReader bufferedReader = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        socket.close();
    }
}
