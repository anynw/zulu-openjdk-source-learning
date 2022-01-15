package com.wuhp.lambda.case1;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类方式，多线程程序已经启动");
            }
        }).start();

        //lambda 表达式方式
        new Thread(() -> {
            System.out.println("lambda 表达式方式，多线程程序已经启动");
        }).start();

    }
}
