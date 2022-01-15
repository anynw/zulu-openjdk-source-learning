package com.wuhp.thread.case3;

/**
 * 生产者消费者案例
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class Box {
    //定义成员变量，表示第X瓶奶
    private int milk;

    //定义成员变量，表示奶箱的状态，默认没有牛奶
    private boolean state = false;

    public synchronized void put(int milk) {
        //如果有牛奶，等待消费
        if (state) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶，就生产牛奶
        this.milk = milk;
        System.out.println("送奶工将第" + this.milk + "瓶奶放入奶箱");
        //生产完毕，修改奶箱状态
        state = true;

        //唤醒其他等待的线程
        notifyAll();
    }

    public synchronized void get() {
        if (!state) {//如果没有牛奶，等待生产
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到了第" + this.milk + "瓶奶");
        //消费完毕，修改状态
        state = false;

        //唤醒其他等待的线程
        notifyAll();
    }

}
