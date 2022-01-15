package com.wuhp.thread;

/**
 * 实现 Runnable 接口
 * @author wuhp
 * @date 2022/1/15
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
