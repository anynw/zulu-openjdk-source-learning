package com.wuhp.net.case11;

import java.io.*;
import java.net.Socket;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class ServerThread implements Runnable {

    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // BufferedWriter bw = new BufferedWriter(new FileWriter("msg-copy.txt"));
            int count = 0;
            File file = new File("msg-copy[" + count + "].txt");
            while (file.exists()) {
                count++;
                file = new File("msg-copy[" + count + "].txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            // 给出反馈
            BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bwServer.write("文件上传成功");
            bwServer.newLine();
            bwServer.flush();

            //释放资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
