package com.wuhp.thread.case3;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class Producer implements Runnable {
    private Box box;

    public Producer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        // 生产五瓶牛奶
        for (int i = 1; i <= 5; i++) {
            box.put(i);
        }
    }
}
