package com.wuhp.lambda.case3;

/**
 * 带参数的案例
 * @author wuhp
 * @date 2022/1/15
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //匿名内部类
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println("s = " + s);
                System.out.println("匿名内部类,,,,");
            }
        });

        //lambda 表达式
        useFlyable(a -> {
            System.out.println(a);
            System.out.println("lambda,,,,");
        });
    }

    private static void useFlyable(Flyable f) {
        f.fly("fly,,,,,,,");
    }
}
