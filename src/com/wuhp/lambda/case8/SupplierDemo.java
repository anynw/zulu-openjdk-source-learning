package com.wuhp.lambda.case8;

import java.util.function.Supplier;

/**
 * @author wuhp
 * @date 2022/1/25
 */
public class SupplierDemo {
    public static void main(String[] args) {
        // String string = getString(() -> {
        //     return "string-demo";
        // });
        String string = getString(()->"string-demo");
        System.out.println("string = " + string);

        Integer integer = getInteger(()->1);
        System.out.println("integer = " + integer);
    }

    private static Integer getInteger(Supplier<Integer> sup){
        return sup.get();
    }

    private static String getString(Supplier<String> sup){
        return sup.get();
    }
}
