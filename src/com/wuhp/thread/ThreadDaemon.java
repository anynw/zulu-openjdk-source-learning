package com.wuhp.thread;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class ThreadDaemon extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
