package com.wuhp.thread;

/**
 * @author wuhp
 * @date 2022/1/15
 */

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        //同一个资源，多个线程实现
        Thread t1 = new Thread(myRunnable, "高铁");
        Thread t2 = new Thread(myRunnable, "飞机");

        t1.start();
        t2.start();
    }
}
