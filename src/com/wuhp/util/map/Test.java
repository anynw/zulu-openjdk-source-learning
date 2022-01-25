package com.wuhp.util.map;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        // map.put("1", "hello");
        // map.put("2", "world");
        System.out.println(map.get("1"));
        System.out.println(map.get("2"));
        for (int i = 0; i < 100000; i++) {
            map.put("hello" + i, "world" + i);
            // System.out.println(map.get("hello" + i));
        }
        System.out.println();
        System.out.println(Math.log10(2));
        System.out.println("Math.log(10) = " + Math.log(10));
        System.out.println("Math.log10(100) = " + Math.log10(100));

    }
}
