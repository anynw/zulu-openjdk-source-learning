package com.wuhp.net.case4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Tcp 发送数据
 * 1、创建客户端 socket 对象
 * 2、获取输出流，写入数据
 * 3、释放资源
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 10000);
        Socket socket = new Socket("127.0.0.1", 10000);
        //获取输出流
        OutputStream os = socket.getOutputStream();
        String msg = "hello,it is me";
        os.write(msg.getBytes());
        //释放资源
        os.close();
    }
}
