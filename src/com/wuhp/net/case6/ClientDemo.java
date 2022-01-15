package com.wuhp.net.case6;

import java.io.*;
import java.net.Socket;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10000);

        //键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象，字节输出流->字符输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        socket.close();
    }
}
