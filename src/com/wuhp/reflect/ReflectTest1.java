package com.wuhp.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList<Integer> 中添加字符串
 * @author wuhp
 * @date 2022/1/26
 */
public class ReflectTest1 {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        Class<? extends List> aClass = list.getClass();
        Method addMethod = aClass.getMethod("add", Object.class);
        addMethod.invoke(list, "hello");

        System.out.println(list);
    }
}
