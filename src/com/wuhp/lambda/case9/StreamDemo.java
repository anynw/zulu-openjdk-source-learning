package com.wuhp.lambda.case9;


import java.util.*;
import java.util.stream.Stream;

/**
 * @author wuhp
 * @date 2022/1/26
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        Map<String,Object> map = new HashMap<String,Object>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<Object> valueStream = map.values().stream();
        Stream<Map.Entry<String, Object>> entryStream = map.entrySet().stream();
        String[] arr = {"hello","world","java"};
        Stream<String> strArrayStream = Stream.of(arr);


    }
}
