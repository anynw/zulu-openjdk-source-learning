package com.wuhp.net.case11;

import java.io.*;
import java.net.Socket;

/**
 * 客户端：数据来源于文本文件
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        //键盘录入
        BufferedReader br = new BufferedReader(new FileReader("msg.txt"));
        //封装输出流对象，字节输出流->字符输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //自定义结束标记
        // bw.write("886");
        // bw.newLine();
        // bw.flush();

        socket.shutdownOutput();

        System.out.println("client");

        //接收服务器的反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s = brClient.readLine();//等待读取数据
        System.out.println("服务器的反馈：" + s);

        br.close();
        socket.close();
    }
}
