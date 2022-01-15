package com.wuhp.thread.case1;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class SellTicket implements Runnable {
    // private int tickets = 100;
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    private Object lock = new Object();

    @Override
    public void run() {
        //问题：1、重复卖票 2、出现负数票
        while (true) {
            if (x % 2 == 0) {
                // synchronized (obj) {// obj
                // synchronized (this) {// this
                synchronized (SellTicket.class) {// class
                    if (tickets > 0) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
                sellTicket();
            }
            x++;
        }

    }

    // private  void sellTicket() {
    //     synchronized (obj) { // 代码块 锁 -> obj
    //         if (tickets > 0) {
    //             try {
    //                 Thread.sleep(10);
    //             } catch (InterruptedException e) {
    //                 e.printStackTrace();
    //             }
    //             System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
    //             tickets--;
    //         }
    //     }
    // }

    // private synchronized void sellTicket() { // 对象锁 -> this
    //     if (tickets > 0) {
    //         try {
    //             Thread.sleep(10);
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
    //         System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
    //         tickets--;
    //     }
    // }

    private synchronized static void sellTicket() {// class
        if (tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }
    }
}
