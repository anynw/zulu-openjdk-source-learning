package com.wuhp.thread.case2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class SellTicket implements Runnable {
    private static int tickets = 100;
    private Lock lock = new ReentrantLock();


    // @Override
    // public void run() {
    //     while (true) {
    //         lock.lock();
    //         if (tickets > 0) {
    //             try {
    //                 Thread.sleep(0);
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //             System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
    //             tickets--;
    //         }
    //         // 如果锁内代码 抛了异常，代码执行不到 unlock 会造成锁没有被释放 finally可以解决
    //         lock.unlock();
    //     }
    // }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickets > 0) {
                    try {
                        Thread.sleep(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}



