package com.wuhp.thread;

/**
 * start 方法和 run 方法的区别
 * 单独调用run方法，是同步执行，但是通过调用 start 方法，是异步执行
 * start  方法可以异步调用run方法
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class Thread01Demo {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        Thread01 thread02 = new Thread01();

        // thread01.run();
        // thread02.run();

        thread01.setName("thread 1 --------");
        thread02.setName("thread 2 --------");


        //1、线程优先级 默认 5 最小1 最大10
        //2、优先级决定不了 执行顺序 仅仅表示获取CPU的资源多
        //3、线程调度，两种模式：分时调度模型，抢占式调度模型。
        //4、Java使用的 抢占式调度模型，优先让优先级高的线程使用CPU的资源
        // System.out.println(thread01.getPriority());
        // System.out.println(thread02.getPriority());
        thread02.setPriority(1);
        thread01.setPriority(10);

        thread01.start();
        thread02.start();
    }
}
