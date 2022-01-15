package com.wuhp.lambda.case5;

/**
 * 注意事项
 * 1、使用 lambda 表达式，必须有接口，有且仅有一个抽象方法
 * 2、必须有上下文环境，才能推到出对应的接口
 *
 * @author wuhp
 * @date 2022/1/16
 */
public class LambdaDemo {
    public static void main(String[] args) {
        //1
        useInter(() -> System.out.println("好好学习，天天向上"));

        //2
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();

        //3
        Runnable r = () -> System.out.println("Runnable,Lambda 表达式");
        new Thread(r).start();

        //4
        new Thread(() -> System.out.println("Thread,Lambda 表达式")).start();


    }

    private static void useInter(Inter inter) {
        inter.show();
    }
}
