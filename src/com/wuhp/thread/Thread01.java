package com.wuhp.thread;

/**
 * 继承 Thread 类
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class Thread01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
