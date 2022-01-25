package com.wuhp.lambda.case7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author wuhp
 * @date 2022/1/25
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("ccc");
        list.add("d");
        list.add("bb");
        list.add("aaaa");
        System.out.println("排序前，list = " + list);
        // Collections.sort(list);
        Collections.sort(list,getComparator());
        System.out.println("排序后，list = " + list);

    }

    private static Comparator<String> getComparator(){
        //匿名内部类方式
        // return new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o1.length()-o2.length();
        //     }
        // };

        // return (String s1,String s2) -> s1.length() -s2.length();
        return Comparator.comparingInt(String::length);
    }
}
