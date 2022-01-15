package com.wuhp.thread;

/**
 * 守护线程
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon t1 = new ThreadDaemon();
        ThreadDaemon t2 = new ThreadDaemon();

        //负责保护大哥，大哥刘备死了，你们也不能活
        t1.setName("关羽");
        t2.setName("张飞");

        //大哥是刘备，设置为主线程
        Thread.currentThread().setName("刘备");

        //设置为守护线程，主线程执行完毕了，他们也要消失 Java虚拟机退出了
        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("我是刘备:" + i);
        }


    }
}
