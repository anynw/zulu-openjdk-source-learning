package com.wuhp.thread.case3;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class BoxDemo {
    public static void main(String[] args) {
        //创建奶香对象，共享数据区域
        Box box = new Box();

        //创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
        Producer producer = new Producer(box);

        //创建消费者对象
        Customer customer = new Customer(box);

        //创建两个线程
        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(customer);

        //启动线程
        t1.start();
        t2.start();
    }
}
