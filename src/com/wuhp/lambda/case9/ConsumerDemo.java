package com.wuhp.lambda.case9;

import java.util.function.Consumer;

/**
 * @author wuhp
 * @date 2022/1/25
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        // lambda
        operatorString("张龙", s-> System.out.println(s));
        // 方法引用
        operatorString("张三", System.out::println);

        operatorString("午后时光", s-> System.out.println(new StringBuilder(s).reverse().toString()));


        operatorString("1午后时光2", s-> System.out.println(s), s->System.out.println(new StringBuilder(s).reverse().toString()));
    }

    private static void operatorString(String name , Consumer<String> consumer1,Consumer<String> consumer2){
        // consumer1.accept(name);
        // consumer2.accept(name);
        consumer1.andThen(consumer2).accept(name);
    }

    private static void operatorString(String name , Consumer<String> consumer){
        consumer.accept(name);
    }
}
