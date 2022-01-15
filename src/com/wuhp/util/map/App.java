package com.wuhp.util.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wuhp
 * @date 2022/1/15
 */
public class App {
    public static void main(String[] args) {
        // Map<Integer, String> map = new HashMap<>();
        App map = new App();
        map.put("张三", "数学");
        map.put("里斯", "物理");
        map.put("汪武", "化学");
        map.put("兆欧", "计算机");
        map.put("三八", "科学");

        // System.out.println(map);
    }


    public void put(String key, String value) {
        System.out.printf("key = %s ------------  hash = %s ------------ location = %s\r\n"
                , key, key.hashCode(), Math.abs(key.hashCode() % 8));
    }
}
