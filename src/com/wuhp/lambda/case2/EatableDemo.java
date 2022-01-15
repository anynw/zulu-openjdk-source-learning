package com.wuhp.lambda.case2;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class EatableDemo {
    public static void main(String[] args) {
        Eatable eatable = new EatableImpl();
        eatable.eat();

        //匿名内部类，不需要单独写实现
        useEatable(new Eatable() {
            @Override
            public void eat() {
                System.out.println("重写了方法");
            }
        });

        //lambda 表达式
        useEatable(()->{
            System.out.println("重写了方法");
        });
    }

    private static void useEatable(Eatable e) {
        e.eat();
    }


}
