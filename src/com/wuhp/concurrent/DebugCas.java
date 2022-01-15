package com.wuhp.concurrent;

/**
 * @author wuhp
 * @date 2022/1/12
 */
public class DebugCas implements Runnable{

    private volatile int value;

    //CAS 
    public synchronized int compareAndSwap(int expectedValue,int newValue){
        int oldValue = value;
        if(oldValue == expectedValue){
            value = newValue;
            System.out.println(Thread.currentThread().getName() + "执行成功");
        }
        return oldValue;
    }

    @Override
    public void run() {
        compareAndSwap(100,150);
    }

    public static void main(String[] args) throws InterruptedException {
        DebugCas r = new DebugCas();
        r.value = 100;
        Thread t1 = new Thread(r,"1");
        Thread t2 = new Thread(r,"2");
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(r.value);
    }

}
