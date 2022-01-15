package com.wuhp.thread;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin t1 = new ThreadJoin();
        ThreadJoin t2 = new ThreadJoin();
        ThreadJoin t3 = new ThreadJoin();

        t1.setName("康熙");
        t2.setName("四阿哥");
        t3.setName("五阿哥");

        //康熙挂了，四阿哥和五阿哥才执行
        t1.start();
        try {
            t1.join();//等待这个线程死亡
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        t3.start();

    }
}
