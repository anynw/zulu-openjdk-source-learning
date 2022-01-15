package com.wuhp.thread.case3;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class Customer implements Runnable {
    private Box box;

    public Customer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            // 有奶就一直获取
            box.get();
        }
    }
}
