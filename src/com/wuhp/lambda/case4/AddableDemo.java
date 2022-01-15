package com.wuhp.lambda.case4;

import com.wuhp.lambda.case3.Flyable;

/**
 * 带参数带返回值的案例
 * 1、参数可以省略
 * 2、多个参数的时候，要么同时省略，要么都不省略
 * 3、参数有且只有一个，小括弧可以去掉
 * 4、如果代码块的语句只有一条没可以省略大括号和分号
 * 5、如果有 return 省略掉 return 关键字
 *
 * @author wuhp
 * @date 2022/1/15
 */
public class AddableDemo {
    public static void main(String[] args) {
        useAddable((x, y) -> {
            // return x+y;
            return x - y;//具体的实现
        });

        useFlyable(s -> System.out.println(s));

        useAddable((x, y) -> x + y);
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }

    private static void useFlyable(Flyable f) {
        f.fly("fly,,,,,,,");
    }
}
