package com.wuhp.thread.case1;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread t1 = new Thread(sellTicket, "窗口1");
        Thread t2 = new Thread(sellTicket, "窗口2");
        Thread t3 = new Thread(sellTicket, "窗口3");


        t1.start();
        t2.start();
        t3.start();
    }
}
