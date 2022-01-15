package com.wuhp.thread;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep t1 = new ThreadSleep();
        ThreadSleep t2 = new ThreadSleep();
        ThreadSleep t3 = new ThreadSleep();

        t1.setName("曹操");
        t2.setName("孙权");
        t3.setName("刘备");

        t1.start();
        t2.start();
        t3.start();


    }
}
