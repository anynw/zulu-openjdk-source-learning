package com.wuhp.net.case4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Tcp 接收数据
 * 1、创建服务器的 ServerSocket 对象
 * 2、监听客户端连接，返回一个 socket 对象
 *  Socket.accept()
 * 2、获取输入流，读数据，并把数据显示在控制台
 * 3、释放资源
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String msg = new String(bytes, 0, len);
        System.out.println("msg：" + msg);

        ss.close();
        socket.close();

    }
}
