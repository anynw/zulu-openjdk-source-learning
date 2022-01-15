package com.wuhp.net.case5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        //获取输出流，写数据
        OutputStream os = socket.getOutputStream();
        os.write("hello,it is me".getBytes());

        //获取反馈
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        String data= new String(bytes, 0, len);
        System.out.println("client: " + data);

        socket.close();
    }
}
